package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Customer;
import com.monocept.service.BankService;

@WebServlet("/registeration")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("register do get");
		RequestDispatcher display = request.getRequestDispatcher("/view/registration.jsp");
		display.forward(request, response);
		return;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("register post");

		String name = request.getParameter("name");
		Double balance = Double.parseDouble(request.getParameter("balance"));
		String password = request.getParameter("password");
		String retypepassword = request.getParameter("retypepass");
		
		int hashPass = password.hashCode();

		if (password.equals(retypepassword)) {


			try {

			Customer customer= new Customer(name, balance, hashPass);
			BankService bankservice=BankService.getInstance();
			bankservice.addCustomer(customer);
			
			response.sendRedirect("login");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			PrintWriter pw = response.getWriter();
			pw.println("Password and Retype password must be same");
		}

	}

}
