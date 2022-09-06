<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/FlightInfo.css">
<title>Flight Information</title>
</head>
<body>
	<form>
		<jsp:include page="Nav.jsp" />
		<table>

			<thead>
				<tr>
					<th>BookingId</th>
					<th>FlightId
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
					<td>atw827</td>
					<td>AI2</td>
					<td>78432</td>
					<td>Arun</td>
					<td>arun@gmail.com</td>
					<td>9281903701</td>
					<td>26</td>
					<td><button>Passengers</button></td>
					<td><a href="AdminFlight.jsp">Flights</a></td>

				</tr>
			</tbody>
		</table>


	</form>
</body>
</html>