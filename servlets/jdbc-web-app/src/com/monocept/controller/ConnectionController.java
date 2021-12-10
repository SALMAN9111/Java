package com.monocept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connection")
public class ConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConnectionController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		java.sql.Connection con = null;
		String database = "monoceptdb";
		String url = "jdbc:mysql://127.0.0.1:4040/";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String pass = "root";

//    System.out.println("Enter Employee id :");
//    Scanner scanner = new Scanner(System.in);
//    String empId = scanner.nextLine();

		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url + database, user, pass);

//			String query = "SELECT * FROM EMP";
//			PreparedStatement ps = con.prepareStatement(query);
//			ResultSet rs = ps.executeQuery();
			System.out.println("enter a emp no");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();

			String query = "SELECT * FROM EMP WHERE EMPNO = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, input);
			ResultSet rs = pstmt.executeQuery();


			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();

			pw.println("<h1>connected successfully to  " + con.getCatalog() + " database" + "</h1>");

			System.out.println("Connect access");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}