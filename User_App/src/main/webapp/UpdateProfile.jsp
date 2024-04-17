<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Title</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa; /* Light gray background */
        text-align: center; /* Center-align text */
        margin: 0; /* Remove default margin */
        padding: 20px; /* Add padding */
    }
    .message {
        font-size: 18px; /* Larger font size for message */
        color: #007bff; /* Blue color for message */
        margin-bottom: 20px; /* Add margin bottom */
    }
    a {
        display: inline-block; /* Display links as blocks */
        text-decoration: none; /* Remove underline */
        color: #007bff; /* Blue color for links */
        margin: 0 10px; /* Add margin around links */
    }
    a:hover {
        color: #0056b3; /* Darker shade of blue on hover */
    }
</style>
</head>
<body>
    <%
    String fname = (String) request.getAttribute("fname");
    String msg = (String) request.getAttribute("msg");
    out.print("Page belongs to: " + fname + "<br>");
    out.print("<div class='message'>" + msg + "</div>");
    %>
    <a href="view">View Profile</a>
    <a href="logout">Logout</a>
</body>
</html>
