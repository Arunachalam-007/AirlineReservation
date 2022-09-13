<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.airlinereservation.model.Flight"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/FlightDisplay.css">
<title>Flight Display</title>
</head>
<body>
	<form>

		<jsp:include page="PassengerNav.jsp" />

		<%-- <input type="hidden" value="${param.cls}" id="cls" name="dd_value"> --%>
		<c:set var="cls_value" scope="session" value="${param.cls}" />
		<c:set var="bookingdate_value" scope="session" value="${param.bookingDate}" />
		<c:set var="bookingfromplace_value" scope="session" value="${param.from_place}" />
		
		

		<table>
			<caption style="display:none;">Flight Details</caption>
			<tr>
				<th>Flight ID</th>
				<th>Flight Name</th>
				<th>Departure Date</th>
				<th>Arrival Date</th>
				<th>From Place</th>
				<th>To Place</th>
				<th>Price</th>
				<th colspan="2">Action</th>
			</tr>

			<c:forEach var="flight" items="${infos}">
				
				<tr style="font-size: 10">
					<td>${flight.flightId}</td>
					<td>${flight.flightName}</td>
					<td>${flight.departure}</td>
					<td>${flight.arrival}</td>
					<td>${flight.fromPlace}</td>
					<td>${flight.toPlace}</td>
					<td>&#x20B9; ${flight.price}</td>
					<td><a href="/ticketbook?flightId=${flight.flightId}&bookingClass=${cls_value}">Book</a></td>

				</tr>
			</c:forEach>
		</table>

	</form>

</body>
</html>