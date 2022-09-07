<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/FlightInfo.css">
<title>Flight Information</title>
</head>
<body>
	<form>
		<%-- <jsp:include page="Nav.jsp" /> --%>
		<table>

			 <jsp:include page="AdminNav.jsp" /> 


			<c:forEach var="booked_val" items="${bookedticketval}">
				<thead>
					<tr>
						<th>BookingId</th>
						<th>FlightId</th>
						<th>PNR</th>
						<th>Passenger Name</th>
						<th>Passenger Email</th>
						<th>Passenger Mobile</th>
						<th>Seat Number</th>
						<th colspan="2">Action</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${booked_val.bookingId }</td>
						<td>${booked_val.fid}</td>
						<td>${booked_val.pnr }</td>
						<td>${booked_val.name }</td>
						<td>${booked_val.email }</td>
						<td>${booked_val.mobile }</td>
						<td>${booked_val.seatNumber }</td>
						<td><a href="AdminFlight.jsp">Delete</a></td>

					</tr>
				</tbody>
			</c:forEach>
		</table>


	</form>
</body>
</html>