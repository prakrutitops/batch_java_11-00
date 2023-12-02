<%@page import="com.dao.UserDao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
* {
  box-sizing: border-box;
}

body {
  margin: 0;
  font-family: Arial;
}

.header {
  text-align: center;
  padding: 32px;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  padding: 0 4px;
}

/* Create four equal columns that sits next to each other */
.column {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
  max-width: 25%;
  padding: 0 4px;
}

.column img {
  margin-top: 8px;
  vertical-align: middle;
  width: 100%;
}

/* Responsive layout - makes a two column-layout instead of four columns */
@media screen and (max-width: 800px) {
  .column {
    -ms-flex: 50%;
    flex: 50%;
    max-width: 50%;
  }
}

/* Responsive layout - makes the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .column {
    -ms-flex: 100%;
    flex: 100%;
    max-width: 100%;
  }
  
  
}


.content
  {
  
  	grid-template-columns:auto auto;
  	
  }
</style>
</head>
<body>


	<jsp:include page="header.jsp"/>
	



<!-- Photo Grid -->
<div class="row"> 
  <div class="content">
  
  			<%
					
			List<ProductModel>list = UserDao.productviewdata();
										
			for(ProductModel m :list)
			{
						
					
			%>
   			
   		 <img src="<%=m.getPimage()%>" width="250" height="250">
    	 
    
    	<%
    
				}
    	%>
   
  </div>
 
 
 
</div>

	
		
		<%-- 			<%
					
						List<ProductModel>list = UserDao.productviewdata();
										
						for(ProductModel m :list)
						{
						
					
					%>
					
					<div class="row">
				 			 
				 			 <div class="column" style="background-color:#ccc;">
								    <img alt="" src="<%=m.getPimage()%>">
							</div>	
							  
					</div>
					
					
						<%
						}
						%>
				
					<div class="row"> 
				  	
				  
				 
					
							<img alt="productimage" src="<%=m.getPimage()%>" width="250" height="250">	
							
							<h1><%=m.getPname() %></h1>
							
							<h2><%=m.getPprice() %></h2>
							
							<h3><%=m.getPdes() %></h3>
							
							<img alt="productimage" src="<%=m.getPimage()%>" width="250" height="250">
							
							
							<h1><%=m.getPname() %></h1>
							<h2><%=m.getPprice() %></h2>
							<h3><%=m.getPdes() %></h3>
							
							
							
						
						
					
				 
				
				 
				 
				 
				</div>
				
					
						
						 --%>
						
				
	 
	<jsp:include page="footer.jsp"/>

	
					
					
		


</body>
</html>