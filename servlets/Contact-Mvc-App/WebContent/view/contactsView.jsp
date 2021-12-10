<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ page import="com.monocept.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts View</title>
<%@ page import="java.util.*"%>
</head>
<body>






	<h1 align="center">Contacts List</h1>

	<p align="right">


		<%
			String name = (String) session.getAttribute("uname");
		if (name == null) {
			out.print("Guest ");
			out.println("<a href='Index.html'>Home</a>");
		} else {
			out.print(name);
		%>
	
	<p align="right">
		<a href="Logout?foo=bar">logout</a>

	</p>

	<%
		}
	%>
	</p>
	<p>
		<%
		/* 	List<Contact> cont = (List) request.getAttribute("contacts");
		out.println("Total count = " + cont.size());
		Iterator it = cont.iterator();

		while (it.hasNext()) {
			out.println("<br>" + it.next() + "<a href='edit?id='></a>");
		} */

		List<Contact> contacts = (List) request.getAttribute("contacts");
		out.print("<table style='text-align:center' border=2px><th>Contact ID</th><th>"
				+ "First Name</th><th>Last Name</th><th>Email-Id</th>");

		for (Contact contact : contacts) {
			out.print("<tr><td>" + contact.getId() + "</td><td>" + contact.getFirstName() + " </td><td> "
			+ contact.getLastName() + " </td><td> " + contact.getEmail() + " </td><td> " + " <a href='edit?id=" + contact.getId() + "'>Edit</a>" + "</td></tr>");
		}
		out.print("</table>");
		%>
	
</body>
</html>