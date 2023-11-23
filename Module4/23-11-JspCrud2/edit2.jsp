<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="m" class="com.model.Model"/> <!-- model class -->
<jsp:setProperty property="*" name="m"/> <!-- model property set -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
/* 	out.print(m.getId());
	out.print(m.getName());
	out.print(m.getEmail());
	out.print(m.getAddress());
	out.print(m.getPhone()); */
	
	 int status = Dao.updatedata(m);

	if(status>0)
	{
		response.sendRedirect("index.jsp");
		
	}
	else
	{
		out.print("fail");
	} 
	
%>

</body>
</html>