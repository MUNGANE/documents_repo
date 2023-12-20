<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Login Page</title>
</head>
<body>
   <form action="/processform" method="post">
   <label for ="username">USERNAME</label>
   <input type="text" id="username" name="user-name">
   <label for ="pass">PASSWORD</label>
   <input type="text" id="pass" name="password">
   <input type="submit" value="Submit">
   </form>
</body>
</html>