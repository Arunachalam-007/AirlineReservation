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

	<!-- <form action="Search.jsp"> -->
	<form action="search" method="post" name="signup" >
		<jsp:include page="Nav.jsp" />
		<div class="whole_cont">
			<div class="container">
				<div class="pdetails">
					<h1>Registration Form</h1>
					<label for="pname">Name</label> <input type="text" name="pname"
						placeholder="Enter Name" pattern="[A-Z]{1}[A-Za-z]{3, 18}"
						title="Name should contain letters and white spaces" required>
					<label for="paddr">Address</label> <input type="text" name="paddr"
						placeholder="Enter Address" pattern="[A-Za-z0-9'\.\-\s\,]"
						title="Please Enter the valid address" required> <label
						for="pmobile">Mobile</label> <input type="text" name="pmobile"
						placeholder="Enter Mobile" pattern="(0/91)?[7-9][0-9]{9}"
						title="Please enter the valid mobile Number" required> <label
						for="pemail">Email</label> <input type="email" name="pemail"
						placeholder="Enter Email"
						pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
						title="Please enter the valid email" required> <label
						for="puname">Username</label> <input type="text" name="puname"
						placeholder="Enter Username"
						pattern="^[a-zA-Z0-9](_(?!(\.|_))|\.(?!(_|\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$"
						title="First character is alphanum, should contain 8 characters,then 6 to 18 characters, last character is alphanum."
						required> <label for="pwd">Password</label> <input
						type="password" name="pwd" placeholder="Enter Password"
						pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
						title="The password must contain atleast 8 character and one upper case,lowercase atleast 1 digit 1 special symbol"
						required> <label for="pdob">Date Of Birth</label> <input
						type="date" name="pdob" placeholder="Enter DOB"
						pattern="^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$"
						title="Please enter the correct format dd-MM-yy" required>
					<a href="Index.jsp" class="act">Already have an Account?</a> <input
						type="submit" value="Signup" class="signup_btn">
				</div>
			</div>



			<!-- <div class="flight_img">
	<img src="./Images/emirates.jpg">
	</div> -->
		</div>

	</form>


	<script src="Validator.js"></script> 
	
</body>

</html>