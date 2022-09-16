<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/BookConfirm.css">
<script
	src="https://raw.githack.com/eKoopmans/html2pdf/master/dist/html2pdf.bundle.js" integrity="sha384-oqVuAfXRKap7fdgcCY5uykM6+R9GqQ8K/uxy9rx7HNQlGYl1kPzQho1wx4JwY8wC"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js" integrity="sha384-oqVuAfXRKap7fdgcCY5uykM6+R9GqQ8K/uxy9rx7HNQlGYl1kPzQho1wx4JwY8wC"></script>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js" integrity="sha384-oqVuAfXRKap7fdgcCY5uykM6+R9GqQ8K/uxy9rx7HNQlGYl1kPzQho1wx4JwY8wC"></script>


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/qrcodejs/1.0.0/qrcode.min.js" integrity="sha384-oqVuAfXRKap7fdgcCY5uykM6+R9GqQ8K/uxy9rx7HNQlGYl1kPzQho1wx4JwY8wC"></script>
<title>Book Confirm</title>
</head>
<body>

	<jsp:include page="PassengerNav.jsp" />

	<h1 class="bookhead">Booking Details</h1>
	<input type="hidden" id="uname_val" name="username"
		value="${uname_value}">

	<div id="save">

		<c:forEach var="confirmPassengersVal" items="${confirmPassengers}">
		
		

			<div class="payment">

				<div class="confirm_left">
					<p id="name">Name :${confirmPassengersVal.name }</p>
					<p id="fname">Flight Name :${confirmPassengersVal.fname }</p>
					<p id="bookid">Booking Id :${confirmPassengersVal.bookingId}</p>
					<p id="from_place">From Place
						:${confirmPassengersVal.bookingFromPlace }</p>

					<p id="travel_date">Travel Date
						:${confirmPassengersVal.bookingDate }</p>
					<p id="mobile">Mobile Number :${confirmPassengersVal.mobile }</p>
					<p id="book_cls">Booking Class:
						${confirmPassengersVal.bookingClass }</p>
					<p id="amount">Amount :${confirmPassengersVal.bookingPrice }</p>

					<div class="qr_design">
						<input type="text" spellcheck="false" id="text"
							value="https://www.alr.com" />
						<div id="qrcode"></div>
					</div>

				</div>
			</div>

		</c:forEach>


		<div class="info">
			<h2>Important Information</h2>
			<h3>Check travel guidelines issued by India below:</h3>
			<ol>
				<li>COVID test/vaccination rules: All travellers must either
					carry their COVID vaccination certificate (2 doses taken) or a
					negative RT-PCR test report.</li>

				<li>Quarantine Guidelines: Specific guidelines for quarantine
					may apply for some places. Please refer to the complete list of
					travel guidelines for further details.</li>
				<li>Test on Arrival: No test on arrival.</li>
				<li>Travel guidelines change frequently and the information
					listed here is not exhaustive. Kindly refer to the complete set of
					rules and guidelines issued by the airlines and regulatory
					authorities for a smooth journey. We accept no liability in this
					regard.</li>
				<li>The latest DGCA guidelines state that it is compulsory to
					wear a mask that covers the nose and mouth properly while at the
					airport and on the flight. Any lapse might result in de-boarding.</li>


			</ol>

		</div>


	</div>
	<button onclick="generatePDF()">Print</button>

	<script type="text/javascript" src="BookConfirm.js">
		</script>
</body>
</html>