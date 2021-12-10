<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.monocept.model.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.monocept.service.BankService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Passbook</title>
</head>
<body>

	<h1 align="center">Passbook</h1>
	<a href="welcome">Home</a>
	<p align="right">

		<%
			String name = (String) session.getAttribute("sessionName");
		if (name == null) {
			response.sendRedirect("login");
		} else {

			out.print(name);
			System.out.println("Session name- " + name);

			BankService bankservice = BankService.getInstance();
			Double balance = bankservice.getCustomerBalanceByName(name);
			out.print("<br>");
			out.print("Balance: " + balance);

		}

		List<Customer> customer = (List) request.getAttribute("customerHistory");
		out.print("<table style='text-align:center' border=2px><th>Name</th><th>"
				+ "Amount</th><th>Transaction Type</th><th>Date</th>");

		for (Customer cust : customer) {
			out.print("<tr><td>" + cust.getName() + "</td><td>" + cust.getBalance() + " </td><td> " + cust.getType()
			+ " </td><td> " + cust.getDate() + " </td></tr>");
		}
		out.print("</table>");
		%>
	
	<form id="downloadForm" action="viewpassbook" method="POST">
		<br> <br>
		<center>
			<button>Download</button>
		</center>
	</form>

</body>
</html>