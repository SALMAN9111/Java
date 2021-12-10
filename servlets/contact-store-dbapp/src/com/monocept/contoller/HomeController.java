package com.monocept.contoller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Contact;
import com.monocept.service.ContactService;

@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ContactService contservie = ContactService.getInstance();
		System.out.println("Home contoller");
		List<Contact> contactlist = null;
		try {
			contactlist = contservie.getContacts();
			System.out.println(contactlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		request.setAttribute("contacts", contactlist);
		RequestDispatcher view = request.getRequestDispatcher("/view/home.jsp");
		view.forward(request, response);
	}

}
