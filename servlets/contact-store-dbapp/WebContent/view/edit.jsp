<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.monocept.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<body>
	<%
		Contact contact = (Contact) request.getAttribute("contact");
	%>

	<form action="edit" method="POST">
		ID : <input type="text" name="id" value="${contact.getId()}">
		<br> 
		FirstName : <input type="text" name="firstname" value="${contact.getFirstName()}"> 
		<br> 
		LastName : <input type="text" name="lastname" value="${contact.getLastName()}">
		<br> 
		Email : <input type="text" name="email" value="${contact.getEmail()}"> 
		<br> 
		<input type="submit" value="update contact"> <br>
	</form>
</body>
</html>


