<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



  <p align="right">
    <%
      String name = (String) session.getAttribute("uname");
      out.print(name);
    %>

  </p>
  
  <form method="Post" action="add">
    Id<input type="text" name="id" required><br> FirstName<input
      type="text" name="firstName" required><br> LastName<input
      type="text" name="lastName" required><br> Email id<input
      type="text" name="email" required><br> <input
      type="submit" value="Add">
  </form>

  

</body>
</html>