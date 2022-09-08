<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="../Themes/Index.css">
<title>AirLine Reservation</title>
</head>
<body>
	<form action="login" method="post">
		<div class="container">

			<jsp:include page="Nav.jsp" />

			<div class="slide-container">
				<div class="slides">
					<img alt="Indigo" src="./Images/indigo.jpg" height="400px"
						width="100%">
				</div>

				<div class="slides">
					<img alt="Malaysia" src="./Images/malaysia.jpg" width="100%"
						height="400px">
				</div>

				<div class="slides">
					<img alt="Alr" src="./Images/alr.jpg" width="100%" height="400px">

				</div>

				<div class="slides">
					<img alt="Alr2" src="./Images/alr2.jpg" width="100%" height="400px">

				</div>
				<div class="slides">
					<img alt="AirIndia" src="./Images/AIR-INDIA.jpg" width="100%"
						height="400px">

				</div>

			</div>

			<div class="home_page">
				<div class="home_page_first">
					<h1>Login to the UNIVERSE</h1>
					<p>To build the relationship with us.Future is not in our
						hands. so Let's Explore.</p>
				</div>

				<div class="login">



				 <input type="text" class="u_name" name="username"
						placeholder="Enter Admin/Username"
						pattern="^[a-zA-Z0-9](_(?!(\.|_))|\.(?!(_|\.))|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$"
						title="First character is alphanum,should contain 8 characters, then 6 to 18 characters, last character is alphanum."
						required> <input type="password" class="paswd" name="password" id="pwdId"
						placeholder="Enter Password"
						pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
						title="The password must contain atleast 8 character and one upper case,lowercase atleast 1 digit 1 special symbol"
						required> 
					<!-- 	<p id="text">WARNING! Caps lock is ON.</p> -->
						<input type="submit" value="Login"
						class="login_btn">
						
						<span>${error}</span> 
					<div class="link_align">
						<a id="acnt" href="Signup.jsp">Don't have an account?</a> <a
							href="#" id="acnt1">Forgot password?</a>
					</div>
					<a class="signup_btn" href="Signup.jsp">Signup</a>
				</div>
			</div>

			<div class="flight_det">
				<div class="flights">
					<a href="FlightDetails.jsp"> <img src="./Images/british.jpg"
						id="flight_img" alt="Air India">
					</a>
					<!-- <p>Business Class</p> -->

				</div>

				<div class="flights">
					<a href="FlightDetails.jsp"> <img src="./Images/malaysia.jpg"
						id="flight_img" alt="Malaysia Airline">
					</a>
					<!-- <p>Economy Class</p> -->


				</div>

				<div class="flights">
					<a href="FlightDetails.jsp"> <img src="./Images/airline.jpg"
						id="flight_img" alt="Airline">
					</a>
					<!-- <p>Economy Class</p> -->
				</div>
			</div>
		</div>
		<jsp:include page="Footer.jsp" />
	</form>



	<script src="showSlides.js"></script>
</body>
</html>