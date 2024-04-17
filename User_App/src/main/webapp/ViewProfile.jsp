<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page Title</title>
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
    .user-info {
        background-color: #ffffff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
        display: inline-block;
    }
    .user-info p {
        margin: 10px 0;
    }
    .edit-link {
        color: #007bff;
        text-decoration: none;
    }
    .edit-link:hover {
        color: #0056b3;
    }
    .logout-link {
        margin-top: 20px;
        display: block;
        color: #dc3545;
        text-decoration: none;
    }
    .logout-link:hover {
        color: #c82333;
    }
</style>
</head>
<body>

<div class="container">
    <div class="user-info">
        <%
        UserBean ub = (UserBean) application.getAttribute("Ubean");
        String fname = (String) request.getAttribute("fname");
        out.println("<p>Page belongs to: " + fname + "</p>");
        out.println("<p>" + ub.getFname() + "&nbsp;&nbsp;" + ub.getLname() + "&nbsp;&nbsp;" + ub.getAddress() + "&nbsp;&nbsp;" + ub.getMid()
            + "&nbsp;&nbsp;" + ub.getPhno() + "&nbsp;&nbsp;<a class='edit-link' href='edit'>Edit</a></p>");
        %>
    </div>

    <a class="logout-link" href="logout">Logout</a>
</div>

</body>
</html>
