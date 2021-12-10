<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
     <%@ page import="com.monocept.model.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>
    <%
    List<Contact> contacts = (List) request.getAttribute("contacts");
	out.print("<table style='text-align:center' border=2px><th>Contact ID</th><th>"
			+ "First Name</th><th>Last Name</th><th>Email-Id</th>");

	for (Contact contact : contacts) {
		out.print("<tr><td>" + contact.getId() + "</td><td>" + contact.getFirstName() + " </td><td> "
		+ contact.getLastName() + " </td><td> " + contact.getEmail() + " </td>"+ " </td><td> " + " <a href='edit?id=" + contact.getId() + "'>Edit</a>" + "</td></tr>");
	}
	out.print("</table>");
    %>
</body>
</html>