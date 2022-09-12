<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/ForgotPassword.css">
<title>Forgot Password</title>
</head>
<body>
<form action="forgotpassword" method="post">
<jsp:include page="Nav.jsp" />
<div class="container">
<div class="forgot_details">
<h1>Forgot Password</h1>
<label for="username">Username</label>
<input type="text" placeholder="Enter username" name="username">
<label for="password1">Password</label>
<input type="password" placeholder="Enter Password" name="password1">
<label for="password2">Confirm Password</label>
<input type="password" placeholder="Enter Confirm Password" name="password2">
<span>${message }</span>


<input type="submit" value="Submit" class="submit_btn">
</div>
</div>
</form>

</body>
</html>