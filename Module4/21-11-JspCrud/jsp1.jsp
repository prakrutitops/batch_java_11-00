<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	
	if(pass.equals("1234"))
	{
		out.print("Welcome :"+name);	
	}
	else
	{
		out.print("fail");
	}
	
	
	
%>

<br>
<br>

<%= Calendar.getInstance().getTime() %>


<

</body>
</html>