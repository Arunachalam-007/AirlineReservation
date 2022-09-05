<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights Data</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	
	background-color: hsl(193, 100%, 96%);
}

.bdetails {
	display: flex;
	flex-direction: column;
	gap: 10px;
}

.container {
	margin: 15px;
	max-width: 700px;
	background-color: hsl(193, 100%, 96%);
	padding: 25px 30px;
	height: 100%;
	margin: 20px 0px 10px 100px;
	border-radius: 20px;
	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.15);
}

/* ********************* */

/* ********************* */
 h1 {
	text-align: center;
	margin-bottom: 10px;
}

input {
	height: 45px;
	width: 100%;
	outline: none;
	font-size: 16px;
	border-radius: 5px;
	padding-left: 15px;
	border: 1px solid #ccc;
	border-bottom-width: 2px;
}

input:focus,input:valid,textarea {
	border-color: #9b59b6;
}

label {
	font-size: 18px;
	color: black;
	font-weight: 50;
}


form .res_btn {
	height: 45px;
	margin: 35px 0;
	border-radius: 10px;
	border: none;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	cursor: pointer;
	padding: 10px;
	background-color: hsl(322, 100%, 66%);
	border-radius: 10px;
}

form .res_btn:active {
	background-color: hsl(322, 100%, 66%);
	box-shadow: 0 5px #666;
	transform: translateY(4px);
}
</style>
</head>
<body>


<form method="post">
<jsp:include page="Nav.jsp" />
<h1>Booking Data</h1>
<div class="container">
<div class="bdetails">
<c:forEach var="fid_val" items="${fid_value}">

<label for="name">Flight Id</label> 
<input id="flightId" name="fId" type="text" value="${fid_val.fid}" readonly/>

<label for="name">Flight Name</label> 
<input id="flightId" name="fId" type="text" value="${fid_val.fname}" readonly/>

<label for="name">Name</label> 
<input type="text"name="name" placeholder="Enter Name">
<label for="email">Email</label> 
<input type="email"name="email" placeholder="example@gmail.com">
<label for="dob">DOB</label> 
<input type="date"name="dob" placeholder="Enter DOB">
<label for="mobile">Mobile</label> 
<input type="text"name="mobile" placeholder="Enter Mobile Number">
<label for="addr">Address</label> 
<textarea rows="7" cols="160" name="addr" placeholder="Enter Address"></textarea>
<input type="submit" value="Reserve Flight" class="res_btn"> 
</c:forEach>
</div>
</div>
</form>

</body>
</html>