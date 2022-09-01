<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/Search.css">
<title>Search</title>
</head>
<body>

	<form action="FlightInfo.jsp">
		<!-- <form action="Validator.jsp"> -->

		<jsp:include page="Nav.jsp" />
		<div class="container">
			<div class="fdetails">

				<h1>Check Availability</h1>
				<label for="cls">Choose a Class</label> <select name="cls" id="cls">
					<option value="Business">Business</option>
					<option value="Economy">Economy</option>
				</select> <label for="from_place">From Place</label> <input type="text"
					name="from_place" placeholder="Enter from place"
					pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required>
				<label for="to_place">To Place</label> <input type="text"
					name="to_place" placeholder="Enter to place"
					pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required>
				<label for="bdate">Booking Date</label> <input type="date"
					name="bdate" placeholder="Enter Booking Date"
					pattern="^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$"
					title="Please enter the correct format dd-MM-yy" required>
				<input type="submit" value="Search" class="search_btn">
			</div>
		</div>

	</form>

</body>
</html>