package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moncept.Service.SecurityService;

@WebServlet("/login")
public class ContactLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactLoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("contact login do get");
		RequestDispatcher loginPage = request.getRequestDispatcher("/view/login.jsp");
		loginPage.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SecurityService securityService = new SecurityService();

		boolean checkAuth = securityService.userAuth(request.getParameter("name"), request.getParameter("password"));

		if (checkAuth == true) {
			System.out.println("inside true");
			PrintWriter out = response.getWriter();

			String uname = request.getParameter("name");
			String upass = request.getParameter("password");

			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);

//        RequestDispatcher view = request.getRequestDispatcher("/view/contactAdd.jsp");
//        view.forward(request, response);
			response.sendRedirect("add");
			return;
		}
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("Invalid input");
	}

}