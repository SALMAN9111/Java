package com.monocept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.moncept.Service.ContactService;
import com.monocept.model.Contact;

@WebServlet("/edit")
public class ContactEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactEditController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("uname"));
		if (session.getAttribute("uname") == null) {
			response.sendRedirect("login");
		} else {
			String contactId = (request.getParameter("id"));
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");

		    System.out.println(request.getParameter("id"));
			System.out.println("inside edit controller");
			Contact contact = new Contact(contactId, firstName, lastName, email);
			
		    request.setAttribute("contacts", contact);
			
			RequestDispatcher display = request.getRequestDispatcher("/view/edit.jsp");
			display.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
