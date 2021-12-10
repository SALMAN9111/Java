package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.service.BankSecurity;
import com.monocept.service.BankService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Welcome to login");
		System.out.println("register do get");
		RequestDispatcher display = request.getRequestDispatcher("/view/login.jsp");
		display.forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BankSecurity bnksecurity = new BankSecurity();

		BankService bankService = BankService.getInstance();

		try {
			boolean isAdmin = bankService.checkRole(request.getParameter("name"));

			if (isAdmin == true) {
				boolean custValidate = bnksecurity.userAuth(request.getParameter("name"),
						request.getParameter("password").hashCode());
				
				if (custValidate) {

					HttpSession session = request.getSession(true);
					session.setAttribute("sessionName", request.getParameter("name"));

					response.sendRedirect("welcomeAdmin");
					
					return;
				}

			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			boolean custValidate = bnksecurity.userAuth(request.getParameter("name"),
					request.getParameter("password").hashCode());

			if (custValidate) {

				HttpSession session = request.getSession(true);
				session.setAttribute("sessionName", request.getParameter("name"));

				/*
				 * RequestDispatcher display =
				 * request.getRequestDispatcher("/view/bankingapp.jsp");
				 * display.forward(request, response);
				 */

				response.sendRedirect("welcome");

				return;
			}

			/*
			 * response.setContentType("text/html"); PrintWriter pw = response.getWriter();
			 * 
			 * pw.println("Invalid Username/password");
			 */

			RequestDispatcher display = request.getRequestDispatcher("/view/errorlogin.jsp");
			display.forward(request, response);
			return;

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
