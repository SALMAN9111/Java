<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.monocept.service.BankService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p align="center">
		<%
			out.println("Transaction");
		%>
	</p>



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
		%>
	</p>

	<form action="dotransaction" method="POST">
		Amount : <input type="text" name="amount"> <br>
		<p>
			<input type="radio" name="tarnsac" value="deposit"> Deposit</input>
		</p>
		<p>
			<input type="radio" name="tarnsac" value="withdraw"> Withdraw</input>
		</p>


		<input type="submit" value="Submit">
	</form>

</body>
</html>