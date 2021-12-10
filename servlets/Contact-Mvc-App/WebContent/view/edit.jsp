<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit page</title>
</head>
<body>
	<form method="Post" action="add">
		List<Contact> contacts = (List) request.getAttribute("contacts");
		
		Id<input type="hidden" name="id" required><br> 
		FirstName<input type="text" name="firstName" required><br> 
		LastName<input type="text" name="lastName" required><br> 
		Email <input type="text" name="email" required><br> 
		<input type="submit" value="Add">
	</form>
</body>
</html>