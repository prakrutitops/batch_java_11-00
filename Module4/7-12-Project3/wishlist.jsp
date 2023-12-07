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
	
	List<WishlistModel> list=UserDao.getallwishdetail(m2);
	
	
	for(WishlistModel m : list)
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
			
			
			<form action="addtocart2.jsp">
						
							<p>
								<input type="hidden" name="id" value="<%=m.getId()%>">
							</p>
							<p>
								<input type="hidden" name="pname" value="<%=m.getPname()%>">
							</p>
							
							<p>
								<input type="hidden" name="pprice" value="<%=m.getPprice()%>">
							</p>
							
							<p>
								<input type="hidden" name="pdes" value="<%=m.getPdes()%>">
							</p>
							
							<p>
								<input type="hidden" name="pimage" value="<%=m.getPimage()%>">
							</p>
							
								<p>
								<input type="hidden" name="email" value="<%=session.getAttribute("myemail")%>">
							</p> 
						
						
						<input type="submit" class="swd-button" value="Add to Cart">
							
						</form>
							
		
	
	
	<%
	
	}
	%>	




<jsp:include page="footer.jsp"/>
</body>
</html>