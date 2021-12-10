<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.monocept.service.BankService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
</head>
<body>
	<h2>Welcome Admin</h2>

	<p align="right">

		<%
			String name = (String) session.getAttribute("sessionName");
		out.print("Admin "+name);
		System.out.println("Session name- " + name);

		%>
	</p>

	<br>
	<br>
	<a href="viewCustomers">View All Customers</a>
	<br>
	<a href="AdminViewTransactionsController">View All Transactions</a>
	<br>
	<br>
	<form action="logout" method="Post">
		<button type="submit">Logout</button>
	</form>

</body>
</html>