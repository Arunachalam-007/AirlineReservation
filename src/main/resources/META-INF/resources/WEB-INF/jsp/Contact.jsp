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
<div class="container">
  <div style="text-align:center">
    <h2>Contact Us</h2>
  </div>
  <div class="row">
    <div class="column">
      <img src="./Images/alr.jpg" style="width:100%">
    </div>
    <div class="column">
      <form>
        <label for="name">Name</label>
        <input type="text" id="name" name="name" placeholder="Enter Your name">
        <label for="country">Country</label>
        <select id="country" name="country">
          <option value="India">India</option>
          <option value="canada">Canada</option>
          <option value="usa">USA</option>
        </select>
        <label for="subject">Subject</label>
        <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
        <input type="submit" value="Submit">
      </form>
    </div>
  </div>
</div>
</body>
</html>