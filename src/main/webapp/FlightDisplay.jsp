<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.AirLineReservation.alrmodel.Flight"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/FlightDisplay.css">
<title>Flight Display</title>
</head>
<body>
	<form>
		<jsp:include page="Nav.jsp" />
		<table>
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
				<%-- <c:set var="list" value="${flight.departure}" scope="request" /> --%>
				<tr style="font-size: 10">
					<td>${flight.fid}</td>
					<td>${flight.fname}</td>
					<td>${flight.departure}</td>
					<td>${flight.arrival}</td>
					<td>${flight.from_place}</td>
					<td>${flight.to_place}</td>
					<td>${flight.price}</td>
					<td><a href="ticketbook/${flight.fid}">Click</a></td>

				</tr>
			</c:forEach>
		</table>


		<%-- 
		<%
		List<Flight> l = (List<Flight>) request.getAttribute("flightdata");
		out.println(l);

		for (int i = 0; i < l.size(); i++) {
			out.println(l.get(i).getFid());
			out.println(l.get(i).getFname());
			out.println(l.get(i).getDeparture());
			out.println(l.get(i).getArrival());
			out.println(l.get(i).getFrom_place());
			out.println(l.get(i).getTo_place());
			out.println(l.get(i).getPrice());
		}
		 %> --%>

	</form>

</body>
</html>