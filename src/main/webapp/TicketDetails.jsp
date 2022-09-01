<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/TicketDetails.css">
<title>AirLine Ticket</title>
</head>
<body>
	<form action="TicketBooking.jsp">
		<jsp:include page="Nav.jsp" />
		<table>

			<thead>
				<tr>
					<th>Flight Name</th>
					<th>Departure</th>
					<th>Duration</th>
					<th>Arrival</th>
					<th colspan="2">Price</th>
				</tr>
			</thead>

			<tbody>
				<tr>
					<td>Indigo</td>
					<td>07:00</td>
					<td>02 h 35 m</td>
					<td>09:35</td>
					<td>&#x20B9; 9,527</td>
					<td><button>VIEW PRICES</button></td>
				</tr>

				<tr>
					<td>Vistara</td>
					<td>03:00</td>
					<td>04 h 35 m</td>
					<td>07:35</td>
					<td>&#x20B9; 12,532</td>
					<td><button>VIEW PRICES</button></td>
				</tr>
			</tbody>

		</table>
	</form>

</body>
</html>