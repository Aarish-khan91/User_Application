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
    }
    .container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh; /* Full viewport height */
    }
    .message {
        font-size: 18px; /* Larger font size for message */
        color: #007bff; /* Blue color for message */
    }
</style>
</head>
<body>
    <div class="container">
        <%
        String msg = (String) request.getAttribute("msg");
        out.print("<div class='message'>" + msg + "</div>");
        %>
    </div>
</body>
</html>
