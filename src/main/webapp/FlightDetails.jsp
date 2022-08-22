<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/FlightDetails.css">
<title>Flight Details</title>
</head>
<body>
<form>
<div class="container">
<div class="fdetails">

<h1>Check Availability</h1>
<label for="from_place">From Place</label>
<input type="text" name="from_place" placeholder="Enter from place">
<label for="to_place">To Place</label>
<input type="text" name="to_place" placeholder="Enter to place">
<label for="bdate">Booking Date</label>
<input type="date" name="bdate" placeholder="Enter Booking Date">

<input type="submit" value="Search" class="search_btn">
</div>
</div>

</form>
</body>
</html>