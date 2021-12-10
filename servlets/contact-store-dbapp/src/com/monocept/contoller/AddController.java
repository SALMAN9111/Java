package com.monocept.contoller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Contact;

import com.monocept.service.ContactService;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Add do get");
		RequestDispatcher display = request.getRequestDispatcher("/view/contactAdd.jsp");
		display.forward(request, response);
		return;

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Add post");

		String id = request.getParameter("id");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");

		System.out.println("id- " + id);

		Contact contact = new Contact(id, fname, lname, email);

		try {

			ContactService contactService = ContactService.getInstance();

			contactService.addContact(contact);

			response.sendRedirect("home");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}