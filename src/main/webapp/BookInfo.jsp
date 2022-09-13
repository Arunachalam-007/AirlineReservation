<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/BookInfo.css">
<title>Flights Data</title>
</head>
<body>

<form method="post" action="payticketbooking">
<jsp:include page="PassengerNav.jsp" />
<h1>Booking Data</h1>
<div class="container">
<div class="bdetails">
<input type="hidden" id="uname_val" name="username" value="${uname_value}">
<c:forEach var="fid_val" items="${flightid_value}">

<input type="hidden" id="cls_val" name="bookingclass" value="${cls_value}">

<input type="hidden" id="bprice" name="bookingprice" value="${fid_val.price + fid_val.price/100*5}">



<input id="bdate" name="bookingdate" value="${bookingdate_value}" type="hidden"/>
<input id="bfrom" name="bookingfrom_place" value="${bookingfromplace_value}" type="hidden"/>
<input id="flightId" name="flightId" value="${fid_val.flightId}" type="hidden" readonly/>

<label for="name">Flight Name</label> 
<input id="flightId" name="flightName" type="text" value="${fid_val.flightName}" readonly/>


<label for="name">Name</label> 
<div class="input-div">
<input type="text"name="name" placeholder="Enter Name" id="name" pattern="[A-Z]{1}[A-Za-z]{3, 18}"
						title="Name should contain Capital letters and white spaces" required>
<span id="nameerror">${nameerror }</span>
</div>
<label for="email">Email</label> 
<div class="input-div">
<input type="email"name="email" placeholder="example@gmail.com" id="email" pattern="/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/"
						title="Please enter the valid email" required>
<span id="emailerror">${emailerror }</span>
</div>
<label for="dob">DOB</label> 
<div class="input-div">
<input type="date"name="dateOfBirth" placeholder="Enter DOB" id="dob" pattern="^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\d\\d$"
						title="Please enter the correct format dd-MM-yy" required>
<span id="errordob">${errordob }</span>
</div>

<label for="nationality">Nationality</label> 
<div class="input-div">
<input type="text" name="nationality" placeholder="Enter Nationality" id="nationality" pattern="[A-Z]{1}[A-Za-z]{3, 18}"
						title="Nationality should contain letters and white spaces" required>
<span id="nationalityerror">${nationalityerror }</span>
</div>
<label for="mobile">Mobile</label> 
<div class="input-div">
<input type="text"name="mobile" placeholder="Enter Mobile Number" id="mobile" pattern="(0/91)?[7-9][0-9]{9}" 
						title="Please enter the valid mobile Number" required>
<span id="mobileerror">${mobileerror }</span>
</div>
<label for="address">Address</label> 
<div class="input-div">
<textarea rows="7" cols="85" name="address" placeholder="Enter Address" id="address" pattern="[A-Za-z0-9'\.\-\s\,]" 
						title="Please Enter the valid address" required></textarea>
<span id="addresserror">${addresserror }</span>
</div>
<input type="submit" value="Reserve Flight" class="res_btn" onclick="validation();"> 
</c:forEach>
</div>
</div>
</form>

<script type="text/javascript" src="BookInfoValidator.js"></script>

</body>
</html>