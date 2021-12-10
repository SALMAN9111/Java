package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Application
 */
@WebServlet("/Application")
public class Application extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext app = this.getServletContext();
		Integer count = (Integer) app.getAttribute("counter");

		PrintWriter writer = response.getWriter();
		if (count == null) {
			count = 1;
		} else {
			count++;
		}
		app.setAttribute("counter", count);

		int previousCounter = count;
		previousCounter--;
		writer.println("<html><body>");
		writer.println("Application Info : ");
		writer.println("Old value - " + previousCounter + "<br>");
		writer.println("New value - " + count + "<br>");
		writer.println("</html></body>");

		writer.flush();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
