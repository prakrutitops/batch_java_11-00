<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.CartModel"/>
<jsp:setProperty property="*" name="m"/>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		
		int status = UserDao.addtocart(m);

	
		 if(status>0)
		{
			response.sendRedirect("cart.jsp");
			
		}
		else
		{
			out.print("fail");
		} 
	

	
	
%>

</body>
</html>