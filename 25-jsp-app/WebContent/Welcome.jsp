<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>

<!DOCTYPE html ">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>I</title>
</head>
<body>
<h1>Welcome to jsp</h1>
<%@include file="Demo.jsp" %>

<%
Date date = new Date();
int a = 10;
%>
<%! int b = 20; %>
<%= date %>
<b><%= b %></b>
</body>
</html>