<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/AdminFlight.css">
<title>AdminFlight</title>
</head>
<body>

	<form action="adminflight" method="post">
	<%-- 	<jsp:include page="Nav.jsp" /> --%>
	<jsp:include page="AdminNav.jsp" />
		<div class="whole_cont">
			<div class="container">
				<div class="fdetails">
					<h1>Add Flight Details</h1>
					<label for="fid">Flight Id</label>
					<div class="input-div"> <input type="text" name="flightid" id="flightId"
						placeholder="Enter Flight Id">
						<span>${idError }</span>
						</div>
						 <label for="fname">Flight Name</label>
						 <div class="input-div">
					<input type="text" name="flightname" placeholder="Enter Flight Name" id="flightName"></div>
					<label for="departure">Departure</label> 
					<div class="input-div">
					<input type="date"
						name="departure" placeholder="Enter Departure" id="departure"> 
						</div>
						 <label for="arrival">Arrival</label>
						 <div class="input-div">
					<input type="date" name="arrival" placeholder="Enter Arrival" id="arrival">
					</div>
					<label for="start_time">Start Time</label> 
					<div class="input-div">
					<input type="time" name="start_time"
						placeholder="Enter Start Time" id="startTime">
						</div>
					<label for="end_time">End Time</label> 
					<div class="input-div">
					<input type="time" name="end_time"
						placeholder="Enter End Time" id="endTime">
						</div>
					<label
						for="from">From</label>
						<div class="input-div"> <input type="text" name="from"
						placeholder="Enter From Place" id="fromPlace">
						</div>
						<label
						for="to">To</label>
						<div class="input-div"> <input type="text" name="to"
						placeholder="Enter To Place" id="toPlace">
						</div>
					<label for="price">Price</label>
					<div class="input-div"> <input type="text" name="price"
						placeholder="Enter Price" id="price">
						</div>
					<label for="seat">Seat</label>
					<div class="input-div"> <input type="number" name="seat"
						placeholder="Enter Seat" id="seat">
						</div>
						<input type="submit" value="Submit" class="submit_btn" onclick="return validation();">
						
						
				</div>
			</div>
			</div>
	</form>

<script src="AdminFlightValidation.js"></script>
</body>
</html>