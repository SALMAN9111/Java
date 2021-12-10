package com.monocept.contoller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Contact;
import com.monocept.service.ContactService;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/edit")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contactId = (request.getParameter("id"));
		ContactService contactService = ContactService.getInstance();
		try {
			Contact contact = contactService.getContactById(contactId);
			request.setAttribute("contact", contact);
			RequestDispatcher display = request.getRequestDispatcher("/view/edit.jsp");
			display.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		
		Contact contact = new Contact(id, fname, lname, email);

		try {

			ContactService contactService = ContactService.getInstance();

			contactService.updateContact(contact);

			response.sendRedirect("home");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
