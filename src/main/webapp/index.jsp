<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="./Themes/index.css">
<title>AirLine Reservation</title>
</head>
<body>
	<form>
		<div class="container">
			<div class="nav_menu">
				<ul>
					<li><a href="Flight_info.jsp">FlightInfo</a></li>
					<li><a href="FlightDetails.jsp">About</a></li>
					<li><a href="#">Contact</a></li>
					<li><a href="#" class="active">ALR</a></li>

				</ul>

			</div>

			<div class="home_page">
				<div class="home_page_first">
					<h1>Login to the UNIVERSE</h1>
					<p>To build the relationship with us.Future is not in our
						hands. so Let's Explore.</p>
				</div>

				<div class="login">
					<input type="text" class="u_name" name="uname"
						placeholder="Enter Username"> <input type="password"
						class="paswd" name="pwd" placeholder="Enter Password"> <input
						type="submit" value="Login" class="login_btn">
					<a id="acnt" href="Signup.jsp">Don't have an account?</a>
					<a class="signup_btn" href="Signup.jsp">Signup</a>
				</div>
			</div>

			<div class="flight_det">
				<div class="flights">
					<img src="./Images/AIR-INDIA.jpg" id="flight_img" alt="Air India">
					<p>Domestic Flights</p>
				</div>

				<div class="flights">
					<img src="./Images/malaysia.jpg" id="flight_img"
						alt="Malaysia Airline">
					<p>International Flights</p>
				</div>


			</div>

		</div>

		<!-- <footer> 
	<h1>Air Line Reservation</h1>
	</footer> -->
	</form>
</body>
</html>