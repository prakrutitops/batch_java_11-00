import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletDemo implements Servlet
{

	@Override
	public void destroy() {
		System.out.println("In Destroy Method... ");		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException 
	{
		System.out.println("In Init Method... ");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse response) throws ServletException, IOException {
		
		System.out.println("In Init Method... ");
		System.out.println("In Service Method...");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello, From ClassWithServletInterface</h1>");
		
	}

}
