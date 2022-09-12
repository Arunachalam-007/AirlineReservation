<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../Themes/Contact.css">
<title>Contact</title>
</head>
<body>

<jsp:include page="Nav.jsp" />
 <form action="contactDetails" method="post">
<div class="container">
  <div style="text-align:center">
    <h2>Contact Us</h2>
  </div>
  <div class="row">
    <div class="column">
      <img src="./Images/alr.jpg" style="width:100%">
    </div>
    <div class="column">
     
        <label for="email">Email</label>
        <input type="email" id="email" name="email" placeholder="example@gmail.com">
        <label for="city">City</label>
        <select id="city" name="city">
          <option value="Chennai">Chennai</option>
          <option value="Madurai">Madurai</option>
          <option value="Mumbai">Mumbai</option>
          <option value="Mumbai">Delhi</option>
          <option value="Mumbai">Bengalore</option>
        </select>
        <label for="subject">Subject</label>
        
        <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
        
        <span>${feedbackmessage }</span>
        <input type="submit" value="Submit">
        
        
     
    </div>
  </div>
</div>
 </form>
</body>
</html>