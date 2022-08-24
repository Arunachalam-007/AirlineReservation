<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/TicketBooking.css">
<title>Ticket Booking</title>
</head>
<body>
	<form>
		<jsp:include page="Nav.jsp" />
		<div class="container">
			<div class="ticket_info">
				<h1>Ticket Details</h1>
			</div>
			<div class="ticket_amt">
				<h1>Fare Summary</h1>
				<!-- <p>Base Fare</p><span>&#x20B9; 8,573</span> -->
				<table>
					<tbody>
						<tr>
							<td>Base Fare</td>
							<td><span>&#x20B9; 8,573</span></td>
						</tr>
						
						<tr>
							<td>Fee & Surcharges</td>
							<td><span>&#x20B9; 529</span></td>
						</tr>
						
						<tr>
							<td>Total Amount</td>
							<td><span>&#x20B9; 9,102</span></td>
						</tr>

					</tbody>

				</table>
			</div>
		</div>
	</form>
</body>
</html>