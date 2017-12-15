<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--  <html>
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
</html>  -->

<html lang="en">
<head>

	  <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
	 <script src="resources/vendor/jquery/jquery.min.js"></script>
	 <script src="resources/js/main.js"></script>
	 <link href="resources/css/main.css" rel="stylesheet">
</head>
<body>

	<div class="wrapper">

<h2>Login</h2>

<form action="/O2_Academy/validateLogin" method="POST">
  

  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="password">Forgot <a href="#">password?</a></span>
  </div>
</form>
</div>>
</body>
</html>