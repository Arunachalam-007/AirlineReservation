<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">

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
<input type="password" placeholder="Enter Password" name="password1" id="id_password">
<em class="bi bi-eye-slash" id="togglePassword1"></em>
<label for="password2">Confirm Password</label>
<input type="password" placeholder="Enter Confirm Password" name="password2" id="id_password2">
<em class="bi bi-eye-slash" id="togglePassword2"></em>
<span id="message">${message }</span>
<span id="msg">${msg }</span>
<span id="messages">${messages }</span>



<input type="submit" value="Submit" class="submit_btn" >
</div>
</div>
</form>
<script src="togglepassword.js"></script>
</body>
</html>