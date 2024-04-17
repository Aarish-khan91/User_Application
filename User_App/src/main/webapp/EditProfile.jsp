<%@page import="com.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Profile</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 0;
        text-align: center;
    }
    .container {
        margin-top: 50px;
    }
    .form {
        background-color: #ffffff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
        display: inline-block;
    }
    .form input[type="text"] {
        width: 100%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }
    .form input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin-top: 10px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    .form input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="container">
    <div class="form">
        <%
        UserBean ub = (UserBean) application.getAttribute("Ubean");
        String fname = (String) request.getAttribute("fname");
        out.println("<p>Page belongs to: " + fname + "</p>");
        %>
        <form action="update" method="post">
            Address : <input type="text" name="address" value="<%=ub.getAddress()%>"><br>
            MailId : <input type="text" name="mid" value="<%=ub.getMid()%>"><br>
            PhoneNo : <input type="text" name="phno" value="<%=ub.getPhno()%>"><br>
            <input type="submit" value="Update Profile">
        </form>
    </div>
</div>

</body>
</html>
