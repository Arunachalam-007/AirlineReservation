<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/FlightDetails.css">
<title>Flight Details</title>
</head>
<body>
	<form action="searchflightwithoutlogin" method="post">
		<jsp:include page="PassengerNav.jsp" />
		<div class="container">

			<div class="fdetails">

				<h1>Check Availability</h1>
				<label for="from_place">From Place</label> <select name="from_place" id="from_place">
					<option value="Madurai">Madurai</option>
					<option value="Chennai">Chennai</option>
					<option value="Bengalore">Bengalore</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Delhi">Delhi</option>
					<option value="USA">USA</option>
					<option value="Dubai">Dubai</option>
					<option value="England">England</option>
				</select>
				<label for="to_place">To Place</label> <select name="to_place" id="to_place">
					<option value="Madurai">Madurai</option>
					<option value="Chennai">Chennai</option>
					<option value="Bengalore">Bengalore</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Delhi">Delhi</option>
					<option value="USA">USA</option>
					<option value="Dubai">Dubai</option>
					<option value="England">England</option>
				</select>
				<label for="bdate">Booking Date</label> <input type="date"
					name="bookingDate" placeholder="Enter Booking Date"> <input
					type="submit" value="Search" class="search_btn"
					onclick="inputCheck(); return false;">
			</div>

			<div class="quote">
				<p>
					<q>Climb the mountain so you can see the world, not so the
						world can see you.</q>
				</p>
			</div>
		</div>


	</form>
	<script type="text/javascript" src="InputSameCheck.js">
	</script>
</body>
</html>