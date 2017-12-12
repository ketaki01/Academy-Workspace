<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form method="POST" action="/O2_Academy/user/validateLogin" >
	
	<label>Username</label> <input type="text" name="username"/>
	<label>password</label> <input type="password" name="password"/>
	<button type="submit">Submit</button>
	
	</form>
</body>
</html>