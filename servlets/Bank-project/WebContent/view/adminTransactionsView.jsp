<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.monocept.service.BankService"%>
    <%@ page import="java.util.*"%>
    <%@ page import="com.monocept.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Transactions</title>
</head>
<body>

<h1 align="center">All Transactinos</h1>
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

		List<Customer> transactions = (List) request.getAttribute("customerTransactions");
		out.print("<table style='text-align:center' border=2px><th>Name</th><th>"
				+ "Amount</th><th>Transaction Type</th><th>Date</th>");

		for (Customer txns : transactions) {
			out.print("<tr><td>" + txns.getName() + "</td><td>" + txns.getBalance() + " </td><td> " + txns.getType()
			+ " </td><td> " + txns.getDate() + " </td></tr>");
		}
		out.print("</table>");
		%>
	
	<form id="downloadForm" action="AdminViewTransactionsController" method="POST">
		<br> <br>
		<center>
			<button>Download</button>
		</center>
	</form>

</body>
</html>