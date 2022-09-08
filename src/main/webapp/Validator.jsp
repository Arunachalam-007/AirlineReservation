<%@page
	import="com.example.AirLineReservation.validation.AlrValidation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation</title>
</head>
<body>

	<p>First Name: ${param.cls}</p>
	<p>From: ${param.from_place }</p>
	<p>To: ${param.to_place }</p>
	<p>To: ${param.bdate }</p>
	
</body>
</html>