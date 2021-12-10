package com.monocept.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Customer;
import com.monocept.service.BankService;

@WebServlet("/viewCustomers")
public class AdminViewCustomersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminViewCustomersController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BankService bankService = BankService.getInstance();

		try {
			List<Customer> customerList = bankService.getAllCustomers();

			request.setAttribute("customersList", customerList);

			RequestDispatcher dispatch = request.getRequestDispatcher("/view/adminCustomerView.jsp");
			dispatch.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
