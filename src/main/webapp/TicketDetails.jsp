<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/TicketDetails.css">
<title>AirLine Ticket</title>
</head>
<body>
	<form>
		<%-- <jsp:include page="Nav.jsp" /> --%>
		<jsp:include page="PassengerNav.jsp" />




		<table>

			<thead>
				<tr>
					<th>Booking Id</th>
					<th>Flight Name</th>
					<th>PNR</th>
					<th>Name</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Seat Number</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="passengertiket"
					items="${passengerbookedticketvalue}">

					
					<tr>
						<td>${passengertiket.bookingId}</td>
						<td>${passengertiket.fname}</td>
						<td>${passengertiket.pnr}</td>
						<td>${passengertiket.name}</td>
						<td>${passengertiket.email}</td>
						<td>${passengertiket. mobile}</td>
						<td>${passengertiket.seatNumber}</td>
						<td><a href="/cancelticket?bookid=${passengertiket.bookingId}&username=${uname_value}">Cancel</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</form>

</body>
</html>