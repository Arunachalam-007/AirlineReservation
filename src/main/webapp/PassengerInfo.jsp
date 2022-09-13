<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/PassengerInfo.css">

<title>Passenger Info</title>
</head>
<body>




	<jsp:include page="AdminNav.jsp" />

	<h1>Passenger Details</h1>
	

	<table>
		<caption style="display: none;">Passenger Details</caption>

		<thead>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Username</th>
				<th>Date Of Birth</th>
				<th>Address</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="passengerInfoValues" items="${passengerInfo}">

				<tr>
					<td>${passengerInfoValues.name}</td>
					<td>${passengerInfoValues.email}</td>
					<td>${passengerInfoValues.mobile}</td>
					<td>${passengerInfoValues.uname}</td>
					<td>${passengerInfoValues.dateOfBirth}</td>
					<td>${passengerInfoValues.address}</td>
					<td><a
						href="/deletepassenger?username=${passengerInfoValues.uname}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	

</body>
</html>