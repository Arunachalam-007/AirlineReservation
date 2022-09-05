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
		<jsp:include page="Nav.jsp" />
		<div class="container">
			<div class="ticket_info">
				<h1>Ticket Details</h1>
				<c:forEach var="bvalues" items="${bookingvalues}">
					<%-- 	<c:out value="${bvalues.fname}"/> --%>
					<table border="0" class="booking_table">
						<tr>
							<td id="pfname" style="border-bottom-style: hidden;">${bvalues.fname}</td>
							<td style="border-bottom-style: hidden;">${bvalues.departure}</td>
							<td style="border-bottom-style: hidden;">${bvalues.from_place}</td>
						</tr>
					</table>
				</c:forEach>

				<div class="info">
					<h2>Important Information</h2>
					<h3>Check travel guidelines issued by Tamilnadu below:</h3>
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
								<td><span>&#x20B9;${bvalues.price}</span></td>
							</tr>

							<tr>
								<td>Fee and Surcharges</td>
								<td><span>&#x20B9; 529</span></td>
							</tr>

							<tr>
								<td>Total Amount</td>
								<td><span>&#x20B9; 9,102</span></td>
							</tr>

						</c:forEach>

					</tbody>

				</table>
				<c:forEach var="bvalues" items="${bookingvalues}">
				<a href="bookingpay/${bvalues.fid}" class="pay_btn">Continue</a>
				 <!-- <input type="submit" value="Continue" class="pay_btn"> -->
				
				</c:forEach>
			</div>

		</div>

	</form>
</body>
</html>