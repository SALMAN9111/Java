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

import com.moncept.Service.ContactService;
import com.monocept.model.Contact;

@WebServlet("/add")
public class ContactAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ContactAddController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("inside of add controller do get");
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("uname"));
		if (session.getAttribute("uname") == null) {
			response.sendRedirect("login");
		} else {
			RequestDispatcher display = request.getRequestDispatcher("/view/contactAdd.jsp");
			display.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		String id = request.getParameter("id");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		Contact contact = new Contact(id, firstName, lastName, email);
		ContactService contactService = ContactService.getInstance();
		contactService.addContact(contact);
		response.sendRedirect("view");
		return;


	}
}




//request.setAttribute("contact", contact);
//RequestDispatcher r = request.getRequestDispatcher("ContactViewController");
//r.forward(request, response);
//
//response.setContentType("text/html");
//pw.println("Contact Added Successfully");
//pw.println("<a href='Index.html'>back to index page</a>");
//pw.println("</html>"); 