<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.monocept.service.BankService"%>
<%@ page import="java.util.*"%>
<%@ page import="com.monocept.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Customers</title>
</head>
<body>

	<h1 align="center">All Customers</h1>
	<a href="welcomeAdmin">Home</a>
	<p align="right">

		<%
			String name = (String) session.getAttribute("sessionName");
		if (name == null) {
			response.sendRedirect("login");
		} else {

			out.print(name);
			System.out.println("Session name- " + name);

			

		}

		List<Customer> customers = (List) request.getAttribute("customersList");
		out.print("<table style='text-align:center' border=2px><th>Name</th>");

		for (Customer cust : customers) {
			out.print("<tr><td>" + cust.getName() + "</td></tr>");
		}
		out.print("</table>");
		%>
	
</body>
</html>