<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/Search.css">
<title>Search</title>
</head>
<body>

	<form action="flightsearch" method="post">
		<!-- <form action="Validator.jsp"> -->

		<%-- <jsp:include page="Nav.jsp" /> --%>
		<jsp:include page="PassengerNav.jsp" />
		<div class="container">
			<div class="fdetails">

				<c:set var="uname_value" scope="session" value="${param.username}" />

				
				<%-- <c:forEach var="seatAvailValue" items="${seatAvailVal}">
					<c:set var="seatAvail" scope="session" value="${seatAvailValue}" />
				</c:forEach> --%>
				<h1>Check Availability</h1>
				<label for="cls">Choose a Class</label> <select name="cls" id="cls">
					<option value="Business">Business</option>
					<option value="Economy">Economy</option>
				</select> <!-- <label for="from_place">From Place</label> <input type="text"
					name="from_place" placeholder="Enter from place" id="from_place" spellcheck="true"
					pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required > -->
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
				<!-- <label for="to_place">To Place</label> <input type="text"
					name="to_place" placeholder="Enter to place" id="to_place"
					pattern="[A-Z]{1}[A-Za-z]{4, 18}"
					title="Place should contain letters and white spaces" required> -->
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
					name="bookingDate" placeholder="Enter Booking Date"
					pattern="^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$"
					title="Please enter the correct format dd-MM-yy" required>
				<input type="submit" value="Search" class="search_btn" onclick="inputCheck(); return false;">
			</div>
		</div>

	</form>

<script type="text/javascript" src="InputSameCheck.js">
</script>
</body>
</html>