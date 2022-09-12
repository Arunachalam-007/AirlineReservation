<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/FlightDetails.css">
<title>Flight Details</title>
</head>
<body>
	<form action="searchflightwithoutlogin" method="post">
		<%-- <jsp:include page="Nav.jsp" /> --%>
		<jsp:include page="PassengerNav.jsp" />
		<div class="container">

			<div class="fdetails">

				<h1>Check Availability</h1>
				<!-- <label for="from_place">From Place</label> <input type="text"
					name="from_place" placeholder="Enter from place" id="from_place"
					pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required>
				<label for="to_place">To Place</label> <input type="text"
					 name="to_place" placeholder="Enter to place"
					id="to_place" pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required> -->
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


		<!-- Climb the mountain so you can see the world, not so the world can see you -->

	</form>
	<script type="text/javascript" src="InputSameCheck.js">
	</script>
</body>
</html>