<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/PassengerNav.css">
<title>Passenger</title>
</head>
<body>

	<div class="nav_menu">
	
		<ul>


			<li><a href="logout">Logout</a></li>
			<li><a href="Contact.jsp">Contact</a></li>
			<li><a href="/Search.jsp">Search</a></li>

			<li><a
				href="passengerbookedticket?username_value=${uname_value}"
				class="active">Booked Ticket</a></li>
			<li><a href="Index.jsp" class="active">Home</a></li>

	
			<li><a href="#" class="nav_left">ALR <span>AirLine
						Reservation </span></a></li>

		</ul>

	</div>
</body>
</html>