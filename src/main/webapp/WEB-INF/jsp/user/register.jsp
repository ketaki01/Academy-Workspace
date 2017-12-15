<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	 <link href="resources/css/stylish-portfolio.css" rel="stylesheet">
	 <script src="resources/vendor/jquery/jquery.min.js"></script>
	 <script src="resources/js/main.js"></script>
	 <link href="resources/css/main.css" rel="stylesheet">
	 
</head>
<body>
	<div class="wrapper">
<h2>Register </h2>
  
  <div class="container">
  	<div>
    <p id="emailvalidation">Email Id is already registered Please Choose a different one</p>
    <p id="associateidvalidation">Associate Id is already registered Please Choose a different one</p>
    <p id="usernamevalidation">User Name is already registered Please Choose a different one</p>
    </div>
    <form:form modelAttribute="user"  action="usersave" id="form">
    <label><b>Name</b></label>
    <form:input type="text" placeholder="Enter Username" name="name" path="name" required="required"></form:input>

    <label><b>Associate Id</b></label>
    <form:input type="text" placeholder="Enter Id" name="Id" path="associateId" required="required"></form:input>

	<br/>
    <label><b>Role</b></label>
    
 <form:select name="Role" path="role">
    <form:option value="associate">Associate</form:option>
    <form:option value="mentor">Mentor</form:option>
    <form:option value="supervisor">Supervisor</form:option>
  </form:select>

  <br>

    <label><b>Email Id</b></label>
    <form:input type="Email" placeholder="Email Id" name="Email" path="email" required="required" id="email"></form:input>
    

    <%-- <label><b>Select Username</b></label>
    <form:input type="text" placeholder="Enter name" name="uname" path="userName" required="required" id="username"></form:input> --%>

    <label><b>Select Password</b></label>
    <form:input type="password" placeholder="Select Password" name="password" path="password" required="required" ></form:input>

    <label><b>Confirm Password</b></label>
    <form:input type="password" placeholder="Confirm Password" name="Password" path="confirmPassword" required="required" ></form:input>        
    <button type="submit" id="registersubmit">Sign Up</button>
</form:form>
</div>
</div>
</body>
</html>