<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body {
    text-align: center;
    font-family: Arial, sans-serif;
    background-color: #f8f9fa;
    margin: 0;
    padding: 0;
  }
  .message {
    margin-top: 20px;
    font-size: 18px;
    color: #007bff;
  }
  .profile-box {
    margin-top: 20px;
    background-color: #ffffff;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    padding: 20px;
    text-align: left;
    max-width: 400px;
    margin: 0 auto;
  }
  .profile-info {
    font-size: 16px;
    color: #333;
    margin-bottom: 10px;
  }
  .link {
    display: block;
    margin-top: 10px;
    text-decoration: none;
    color: #007bff;
    transition: color 0.3s;
  }
  .link:hover {
    color: #0056b3; /* darker shade of blue on hover */
  }
</style>
</head>
<body>
  <div class="message">
    <% 
    UserBean us = (UserBean) request.getAttribute("ub");
    out.print("Login successful <br>");
    out.print(us.getFname() + " welcome.");
    %>
  </div>
  <div class="profile-box">
    <div class="profile-info">
      <p>UserName: <%= us.getUname() %></p>
      <p>First Name: <%= us.getFname() %></p>
      <p>Last Name: <%= us.getLname() %></p>
      <p>Email: <%= us.getMid() %></p>
      <p>Address: <%= us.getAddress() %></p>
      <p>Mobile: <%= us.getPhno() %></p>
    </div>
  </div>
  <a class="link" href="view">View Profile</a>
  <a class="link" href="edit">Edit Profile</a>
  <a class="link" href="logout">Logout</a>
</body>
</html>
