<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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
				<%-- 				<input type="hidden" value="${seatAvailResult}"
					name="seatavailabilityresult" id="seatavailabilityresult"> --%>
				<h1>Ticket Details</h1>
				<c:forEach var="bvalues" items="${bookingvalues}">
					<%-- 	<c:out value="${bvalues.fname}"/> --%>

					<div class="booking_table">
						<p id="fname">${bvalues.flightName}</p>
						<div class="depart-left">
							<p id="from">${bvalues.from_place}</p>
							<p id="depart">${bvalues.departure}</p>

						</div>
						<p id="start_time">${bvalues.start_time}</p>
						<p id="to_link">&nbsp;&nbsp;---------------&nbsp;&nbsp;</p>
						<p id="end_time">${bvalues.end_time}</p>
						<div class="arrival_right">
							<p id="to_place">${bvalues.to_place}</p>
							<p id="arrival">${bvalues.arrival}</p>

						</div>
						<p id="seat_avl">${seatAvailResult}Ticket'sLeft</p>
					</div>
					<%-- <table border="0" class="booking_table">
						<tr>
						
							<td id="pfname" style="border-bottom-style: hidden;">${bvalues.fname}</td>
							<td style="border-bottom-style: hidden;">${bvalues.departure}</td>
							<td style="border-bottom-style: hidden;">${bvalues.from_place}</td>
							<td style="border-bottom-style: hidden;">${bvalues.start_time}</td>
							
							
							<td style="border-bottom-style: hidden;">${bvalues.end_time}</td>
							<td style="border-bottom-style: hidden;">${bvalues.arrival}</td>
							<td style="border-bottom-style: hidden;">${bvalues.to_place}</td>
							
							
							<td style="border-bottom-style: hidden;">${seatAvailResult} Ticket's Left </td>
						</tr>
					</table> --%>
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

					<!-- <input type="checkbox" id="terms" required>
					<label for="terms">I've read and agree to the terms and conditions.</label>
					<input type="submit" value="Continue" class="terms_btn"> -->


					<%-- <c:forEach var="bvalues" items="${bookingvalues}">
						<button></button>
						<a href="bookingpay/${bvalues.fid}" class="terms_btn">Continue</a>
					</c:forEach> --%>

					<!-- <input type="submit" class="contd_btn" value="Continue"> -->
				</div>


			</div>



			<div class="ticket_amt">
				<h1>Fare Summary</h1>
				<!-- <p>Base Fare</p><span>&#x20B9; 8,573</span> -->
				<table>
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
					<%-- <a href="bookingpay/${bvalues.fid}" class="pay_btn">Continue</a> --%>
					<a href="/bookingpay?flightid=${bvalues.flightId}&seatavailabilityresult=${seatAvailResult}" class="pay_btn"
						id="continue_link" onclick="seatAlert();">Continue</a>
					<!-- <input type="submit" value="Continue" class="pay_btn"> -->

				</c:forEach>
			</div>
		</div>

	</form>

	<script type="text/javascript">
		function seatAlert() {

			var seatValue = document.getElementById('seatavailabilityresult').value;
			if (seatValue == 36) {
				alert("it's working");
				//return true;
			}
			else{
				console.log("Proceed");
			}
		}
	</script>
</body>
</html>