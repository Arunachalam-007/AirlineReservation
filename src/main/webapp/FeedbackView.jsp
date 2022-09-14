<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./Themes/FeedbackView.css">
<title>Feedback</title>
</head>
<body>
	<form>
		<jsp:include page="AdminNav.jsp" />
		<h1>Feedback View</h1>
		<table>
			<caption style="display: none;">Feedback</caption>
			
			<thead>
				<tr>
					<th>Email</th>
					<th>City</th>
					<th>Feedback</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="feedback" items="${feedbackresult}">
					<tr>
						<td>${feedback.email}</td>
						<td>${feedback.city}</td>
						<td>${feedback.subject}</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>

	</form>
</body>
</html>