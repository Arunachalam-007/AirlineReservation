<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>flight Information</title>
</head>
<body>
	
	
	
	 <div id="myCarousel" class="carousel slide col-xs-12" data-ride="carousel">
	 	<ol class="carousel-indicators">
			<li data-target="#flight_info" data-slide-to="0" class="active"></li>
			<li data-target="#flight_info" data-slide-to="1"></li>
			<li data-target="#flight_info" data-slide-to="2"></li>
			<li data-target="#flight_info" data-slide-to="3"></li>
			<li data-target="#flight_info" data-slide-to="4"></li>
			<li data-target="#flight_info" data-slide-to="5"></li>
			<li data-target="#flight_info" data-slide-to="6"></li>
		</ol> 

		<div class="carousel-inner">
			<div class="item active">
				<img src="./Images/indigo.jpg " alt="Indigo">
				<div class="carousel-caption">
					<h3>Domestic</h3>
					<p>Indigo</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/AIR-INDIA.jpg " alt="Air India">
				<div class="carousel-caption">
					<h3>Domestic</h3>
					<p>Air India</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/vistara.jpg" alt="Vistara">
				<div class="carousel-caption">
					<h3>Domestic</h3>
					<p>Vistara</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/SpiceJet.jpg " alt="Spice Jet">
				<div class="carousel-caption">
					<h3>Domestic</h3>
					<p>Spice Jet</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/emirates.jpg "alt="Emirates Airlines">
				<div class="carousel-caption">
					<h3>International</h3>
					<p>Emirates Airlines</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/malaysia.jpg"  alt="Malaysia Airlines">
				<div class="carousel-caption">
					<h3>International</h3>
					<p>Malaysia Airlines</p>
				</div>
			</div>

			<div class="item">
				<img src="./Images/british.jpg " alt="British Airlines">
				<div class="carousel-caption">
					<h3>International</h3>
					<p>British Airlines</p>
				</div>
			</div>
		</div>

	<a class="left carousel-control" href="#flight_info" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#flight_info"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right"></span> <span
			class="sr-only">Next</span>
		</a>
 
	</div> 

</body>
</html>