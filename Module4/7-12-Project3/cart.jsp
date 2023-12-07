<%@page import="com.model.CartModel"%>
<%@page import="com.dao.UserDao"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="java.util.List"%>
<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"/>

	<%
	
	SignupModel m2 =new SignupModel();
	String email = (String)request.getSession().getAttribute("myemail");
	m2.setEmail(email);
	
	List<CartModel> list=UserDao.getallcartdetail(m2);
	
	
	for(CartModel m : list)
	{
			
	
	
	%>	
	
	
			<br>
			<br>
			
			<center>
			<p>
				<img width="200px" height="200px" src="<%=m.getPimage()%>">
			</p>
			
			<p>
				<h2><%=m.getPname() %></h2>
			</p>
				
			<p>
				<h3><%=m.getPprice() %></h3>
			</p>
				
			<p>
				<h4><%=m.getPdes() %></h4>
			</p>
						
			</center>				
		
	
	
	<%
	
	}
	%>	




<jsp:include page="footer.jsp"/>
</body>
</html>