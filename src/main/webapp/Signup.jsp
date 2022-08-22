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

	<form>
		<div class="whole_cont">
		<div class="container">
			<div class="pdetails">
			<h1>Registration Form</h1>
<label for="pname">Passenger Name</label>
<input type="text" name="pname" placeholder="Enter Passenger Name">
<label for="paddr">Passenger Address</label>
<input type="text" name="paddr" placeholder="Enter Passenger Address"> 
<label for="pmobile">Passenger Mobile</label>
<input type="text" name="pmobile" placeholder="Enter Passenger Mobile"> 
<label for="pemail">Passenger Email</label>
<input type="text" name="pemail" placeholder="Enter Passenger Email">
<label for="puname">Passenger Username</label>
<input type="text" name="puname" placeholder="Enter Passenger Username">
<label for="pwd">Passenger Password</label> 
<input type="password" name="pwd" placeholder="Enter Passenger Password">
<label for="pdob">Passenger DOB</label>
<input type="date" name="pdob" placeholder="Enter Passenger DOB">

<a href="index.jsp" class="act">Already have an Account?</a>
<input type="submit" value="Signup" class="signup_btn">
			</div>
		</div>

	
	
	<!-- <div class="flight_img">
	<img src="./Images/emirates.jpg">
	</div> -->
		</div>
</form>
</body>
</html>