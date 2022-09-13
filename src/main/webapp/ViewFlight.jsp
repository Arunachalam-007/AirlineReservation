<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/ViewFlight.css">
<title>View Flight</title>
</head>
<body>
	<form>
		<jsp:include page="AdminNav.jsp" />

		<table>
		<caption style="display: none;">Flight Details</caption>
			<tr>
				<th>Flight ID</th>
				<th>Flight Name</th>
				<th>Departure Date</th>
				<th>Arrival Date</th>
				<th>From Place</th>
				<th>To Place</th>
				<th>Price</th>
				<th>Start Time</th>
				<th>End Time</th>
				<th>Seat</th>
				<th colspan="2">Action</th>
			</tr>

			<c:forEach var="flightInfoValues" items="${flightInfo}">

				<tr style="font-size: 10">
					<td>${flightInfoValues.flightId}</td>
					<td>${flightInfoValues.flightName}</td>
					<td>${flightInfoValues.departure}</td>
					<td>${flightInfoValues.arrival}</td>
					<td>${flightInfoValues.fromPlace}</td>
					<td>${flightInfoValues.toPlace}</td>
					<td>&#x20B9; ${flightInfoValues.price}</td>
					<td>${flightInfoValues.startTime}</td>
					<td>${flightInfoValues.endTime}</td>
					<td>${flightInfoValues.seat}</td>
					<td><a href="/deleteflight?flightId=${flightInfoValues.flightId}">Delete</a></td>

				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>