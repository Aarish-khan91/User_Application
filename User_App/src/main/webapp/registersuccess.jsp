<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <% String name  = (String)request.getAttribute("uname"); 
       out.print(name+" your  successfully registered.");
       %>
       <%@ include file="Login.html" %>
</body>
</html>