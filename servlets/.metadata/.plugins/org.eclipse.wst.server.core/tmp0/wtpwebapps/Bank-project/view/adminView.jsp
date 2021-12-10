<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.monocept.service.BankService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin View</title>
</head>
<body>

<h2>Welcome to Admin Page</h2>



	<p align="right">

		<%
			String name = (String) session.getAttribute("sessionName");
			out.print(name);
			System.out.println("Session name- " + name);

			BankService bankservice = BankService.getInstance();
			Double balance = bankservice.getCustomerBalanceByName(name);
			out.print("<br>");
			out.print("Balance: " + balance);
		%>
	</p>


	<br>
	<br>
	<a href="viewCustomers">View Customers</a>
	<br>
	<a href="viewTransactions">View All Transactions</a>
	<br>
	<br>
	<form action="logout" method="Post">
		<button type="submit">Logout</button>
	</form>

</body>
</html>