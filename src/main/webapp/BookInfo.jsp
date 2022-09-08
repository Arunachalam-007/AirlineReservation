<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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


 
<input id="flightId" name="flightId" value="${fid_val.flightId}" type="hidden" readonly/>

<label for="name">Flight Name</label> 
<input id="flightId" name="flightName" type="text" value="${fid_val.flightName}" readonly/>

<label for="name">Name</label> 
<input type="text"name="name" placeholder="Enter Name">
<label for="email">Email</label> 
<input type="email"name="email" placeholder="example@gmail.com">
<label for="dob">DOB</label> 
<input type="date"name="dateOfBirth" placeholder="Enter DOB">
<label for="nationality">Nationality</label> 
<input type="text" name="nationality" placeholder="Enter Nationality">
<label for="mobile">Mobile</label> 
<input type="text"name="mobile" placeholder="Enter Mobile Number">
<label for="address">Address</label> 
<textarea rows="7" cols="160" name="address" placeholder="Enter Address"></textarea>
<input type="submit" value="Reserve Flight" class="res_btn"> 
</c:forEach>
</div>
</div>
</form>



</body>
</html>