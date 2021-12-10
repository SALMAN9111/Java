package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookie
 */
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCookie() {
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
		Cookie cookieName = new Cookie("username", request.getParameter("username"));
		Cookie color = new Cookie("color", request.getParameter("color"));

		cookieName.setMaxAge(7 * 24 * 60 * 60);
		color.setMaxAge(7 * 24 * 60 * 60);

		response.addCookie(cookieName);
		response.addCookie(color);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Name "+request.getParameter("username"));
		pw.println("Color "+request.getParameter("color"));
		pw.println("<html><style>");
//		pw.println(=request.getParameter("color"));
		pw.println("<a href= 'ReadCookie'>Read cookie here</a>");
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
