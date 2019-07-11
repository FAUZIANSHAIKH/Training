<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.Date" %>
<h1>Session Demo</h1>
<hr>
<h3>
Session ID : <%= session.getId() %><br>
Created at : <%= new Date(session.getCreationTime()) %> <br>
Current time: <%= new Date() %><br>
Last Accessed : <%= new Date(session.getLastAccessedTime()) %> <br>
Is new : <%= session.isNew() %><br>

<% 
//session.invalidate(); 
session.setMaxInactiveInterval(30);
%>

	</h3>
</body>
</html>