<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/TicketBooking.css">
<title>Ticket Booking</title>
</head>
<body>
	<form>
		<jsp:include page="PassengerNav.jsp" />
		<div class="container">
			<div class="ticket_info">
				 <input type="hidden" id="seatavailabilityresult"
					name="seatavailabilityresult" value="${seatAvailResult}">
				
				<h1>Ticket Details</h1>
				<c:forEach var="bvalues" items="${bookingvalues}">
					<%-- 	<c:out value="${bvalues.fname}"/> --%>

					<div class="booking_table">
						<p id="fname">${bvalues.flightName}</p>
						<div class="depart-left">
							<p id="from">${bvalues.fromPlace}</p>
							<p id="depart">${bvalues.departure}</p>

						</div>
						<p id="start_time">${bvalues.startTime}</p>
						<p id="to_link">&nbsp;&nbsp;---------------&nbsp;&nbsp;</p>
						<p id="end_time">${bvalues.endTime}</p>
						<div class="arrival_right">
							<p id="to_place">${bvalues.toPlace}</p>
							<p id="arrival">${bvalues.arrival}</p>

						</div>
						<p id="seat_avl">${seatAvailResult}&nbsp;Ticket's&nbsp;Left</p>
					</div>
					
				</c:forEach>

				<div class="info">
					<h2>Important Information</h2>
					<h3>Check travel guidelines issued by India below:</h3>
					<ol>
						<li>COVID test/vaccination rules: All travellers must either
							carry their COVID vaccination certificate (2 doses taken) or a
							negative RT-PCR test report.</li>
						<li>Test on Arrival: No test on arrival.</li>
						<li>Quarantine Guidelines: Specific guidelines for quarantine
							may apply for some places. Please refer to the complete list of
							travel guidelines for further details.</li>
						<li>Travel guidelines change frequently and the information
							listed here is not exhaustive. Kindly refer to the complete set
							of rules and guidelines issued by the airlines and regulatory
							authorities for a smooth journey. We accept no liability in this
							regard.</li>
						<li>The latest DGCA guidelines state that it is compulsory to
							wear a mask that covers the nose and mouth properly while at the
							airport and on the flight. Any lapse might result in de-boarding.</li>

					</ol>

					
				</div>


			</div>



			<div class="ticket_amt">
				<h1>Fare Summary</h1>
			
				<table>
				<caption style="display:none;">Price Details</caption>
				<tr><th></th></tr>
					<tbody>
						<c:forEach var="bvalues" items="${bookingvalues}">


							<tr>
								<td>Base Fare</td>
								<td><span id="value1">&#x20B9;${bvalues.price}</span></td>
							</tr>

							<tr>
								<td>Fee and Surcharges</td>
								<td><span id="value2">&#x20B9;${bvalues.price /100*5}</span></td>
							</tr>



							<tr>
								<td>Total Amount</td>
								<td><span id="result">&#x20B9;${bvalues.price + bvalues.price /100*5}</span></td>
							</tr>

						</c:forEach>

					</tbody>

				</table>
				<c:forEach var="bvalues" items="${bookingvalues}">
					
					<a href="/bookingpay?flightid=${bvalues.flightId}&seatavailabilityresult=${seatAvailResult}" class="pay_btn"
						id="continue_link" onclick="seatAlert();">Continue</a>
				

				</c:forEach>
			</div>
		</div>

	</form>

	<script type="text/javascript">
		function seatAlert() {

			var seatValue = document.getElementById('seatavailabilityresult').value;
			if (seatValue == 36) {
				alert("Seat is not available");
				
			}
			else{
				console.log("Proceed");
			}
		}
	</script>
</body>
</html>