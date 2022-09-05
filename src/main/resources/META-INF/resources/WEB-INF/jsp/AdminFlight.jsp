<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/AdminFlight.css">
<title>AdminFlight</title>
</head>
<body>

	<form action="adminflight" method="post">
		<jsp:include page="Nav.jsp" />
		<div class="whole_cont">
			<div class="container">
				<div class="fdetails">
					<h1>Flight Details</h1>
					<label for="fid">Flight Id</label> <input type="text" name="fid"
						placeholder="Enter Flight Id"> <label for="fname">Flight Name</label>
					<input type="text" name="fname" placeholder="Enter Flight Name">
					<label for="departure">Departure</label> <input type="date"
						name="departure" placeholder="Enter Departure"> <!-- <label
						for="start_time">Start Time</label> <input type="number" name="start_time"
						placeholder="Enter Start Time" step="any" min="0" max="100"> <label
						for="end_time">End Time</label> <input type="number" name="end_time"
						placeholder="Enter End Time" step="any" min="0" max="100"> --><label for="arrival">Arrival</label>
					<input type="date" name="arrival" placeholder="Enter Arrival">
					<label
						for="from">From</label> <input type="text" name="from"
						placeholder="Enter From Place">
						<label
						for="to">To</label> <input type="text" name="to"
						placeholder="Enter To Place">
					<label for="price">Price</label> <input type="text" name="price"
						placeholder="Enter Price">
						<input type="submit" value="Submit" class="submit_btn">
				</div>
			</div>
			</div>
	</form>

</body>
</html>