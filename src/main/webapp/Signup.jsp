<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
<link rel="icon" type="image/png" sizes="32x32"
	href="./images/favicon-32x32.png">

<link rel="stylesheet" href="../Themes/Signup.css">
<title>Signup Form</title>
</head>
<body>

	<jsp:include page="Nav.jsp" />
	<form action="search" method="post" name="signup" id="form">

		<div class="whole_cont">
			<div class="container">
				<div class="pdetails">

					<h1>Registration Form</h1>

					<label for="pname">Name</label>

					<div class="input-div">
						<input type="text" name="name" placeholder="Enter Name" id="name"
							pattern="[A-Z]{1}[A-Za-z]{3, 18}"
							title="Name should contain letters and white spaces" required>
							<span id="nameerror">${nameerror }</span>
						<p class="msg">Enter valid name and name cannot be empty</p>
					</div>

					<label for="address">Address</label>
					<div class="input-div">
						<input type="text" name="address" placeholder="Enter Address"
							id="address" pattern="[A-Za-z0-9'\.\-\s\,]"
							title="Please Enter the valid address" required>
							<span id="addresserror">${addresserror }</span>
						<p class="msg">Enter valid address and address cannot be empty</p>
					</div>

					<label for="pmobile">Mobile</label>
					<div class="input-div">
						<input type="text" name="mobile" id="mobile"
							placeholder="Enter Mobile" pattern="(0/91)?[7-9][0-9]{9}"
							title="Please enter the valid mobile Number" required>
							<span id="mobileexist">${mobileexist}</span>
							<span id="mobileerror">${mobileerror }</span>
							
						<p class="msg">Enter valid mobile number and mobile cannot be
							empty</p>
					</div>
					<label for="pemail">Email</label>
					<div class="input-div">
						<input type="email" name="email" id="email"
							placeholder="Enter Email"
							pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
							title="Please enter the valid email" required> <span id="existemail">${emailexist}</span>
							<span id="emailerror">${emailerror }</span>
						<p class="msg">Enter valid email and email cannot be empty</p>
					</div>
					<label for="puname">Username</label>

					<div class="input-div">
						<input type="text" name="username" id="username"
							placeholder="Enter Username"
							pattern="^[a-zA-Z0-9](_(?!(\.|_))|\.(?!(_|\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$"
							title="First character is alphanum, should contain 8 characters,then 6 to 18 characters, last character is alphanum."
							required>
							<span id="usernameerror">${usernameerror }</span>
						<p class="msg">Enter valid username and username cannot be
							empty</p>
							<span id="unameexist">${exist }</span>
					</div>

					<label for="pwd">Password</label>
					<div class="input-div">
						<input type="password" name="password"
							placeholder="Enter Password" id="id_password"
							pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
							title="The password must contain atleast 8 character and one upper case,lowercase atleast 1 digit 1 special symbol"
							required> <em class="bi bi-eye-slash" id="togglePassword"></em>
							<span id="passworderror">${passworderror }</span>
						<p class="msg">Enter valid password and password cannot be
							empty</p>
					</div>

					<label for="pdob" id="dob">Date Of Birth</label>
					<div class="input-div">
						<input type="date" name="dateOfBirth" id="dob"
							placeholder="Enter DOB"
							pattern="^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$"
							title="Please enter the correct format dd-MM-yy" required>
						<p class="msg">Enter valid DOB and DOB cannot be empty</p>
						<span id="errordob">${doberror }</span>

					</div>
					<a href="Index.jsp" class="act">Already have an Account?</a> <input
						type="submit" value="Signup" class="signup_btn" id="signup_btn"
						onclick="validation();">
				</div>
			</div>




		</div>
	</form>


	<script src="Validator.js"></script>

</body>

</html>