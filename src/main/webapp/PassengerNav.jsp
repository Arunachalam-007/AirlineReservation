<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/PassengerNav.css">
<title>Passenger</title>
</head>
<body>

	<div class="nav_menu">
		<%-- <p>${uname_value}</p> --%>

		<%-- <input type="hidden" id="uname_val" name="uname_value"
			value="${uname_value}"> --%>
		<ul>


			<li><a href="/logout">Logout</a></li>
			<li><a href="Contact.jsp">Contact</a></li>
			<!-- <li><a href="Index.jsp" class="active">Cancelled Ticket</a></li> -->
			<li><a
				href="passengerbookedticket?username_value=${uname_value}"
				class="active">Booked Ticket</a></li>
			<li><a href="Index.jsp" class="active">Home</a></li>

			<!-- <li><a href="javascript: history.go(-1)">Go Back</a></li> -->
			<li><a href="#" class="nav_left">ALR <span>AirLine
						Reservation </span></a></li>

		</ul>

	</div>
</body>
</html>