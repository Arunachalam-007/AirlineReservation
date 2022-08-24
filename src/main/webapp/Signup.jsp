<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/Signup.css">
<title>Signup Form</title>
</head>
<body>

	<form action="Search.jsp">
	<jsp:include page="Nav.jsp"/>
		<div class="whole_cont">
		<div class="container">
			<div class="pdetails">
			<h1>Registration Form</h1>
<label for="pname">Name</label>
<input type="text" name="pname" placeholder="Enter Name">
<label for="paddr">Address</label>
<input type="text" name="paddr" placeholder="Enter Address"> 
<label for="pmobile">Mobile</label>
<input type="text" name="pmobile" placeholder="Enter Mobile"> 
<label for="pemail">Email</label>
<input type="text" name="pemail" placeholder="Enter Email">
<label for="puname">Username</label>
<input type="text" name="puname" placeholder="Enter Username">
<label for="pwd">Password</label> 
<input type="password" name="pwd" placeholder="Enter Password">
<label for="pdob">Date Of Birth</label>
<input type="date" name="pdob" placeholder="Enter DOB">

<a href="Index.jsp" class="act">Already have an Account?</a>
<input type="submit" value="Signup" class="signup_btn" >
			</div>
		</div>

	
	
	<!-- <div class="flight_img">
	<img src="./Images/emirates.jpg">
	</div> -->
		</div>
		
</form>
</body>
</html>