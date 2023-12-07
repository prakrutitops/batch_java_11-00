<%@page import="com.model.WishlistModel"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
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
		
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		//delete
		
		
		//
		int status = UserDao.addtocart(m);
	
		 if(status>0)
		 {
			 Connection con = UserDao.getconnect();
				PreparedStatement ps = con.prepareStatement("delete from wishlist where id=?");
				ps.setInt(1,id2);
			 ps.executeUpdate();
			response.sendRedirect("cart.jsp");
			
		 }
		 else
		 {
			 out.print("fail");
	     } 
	
 
	
	
%>
	

</body>
</html>