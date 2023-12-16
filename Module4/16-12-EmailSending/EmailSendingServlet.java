import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmailSendingServlet extends HttpServlet
{
	
	private String host;
	private String port;
	private String user;
	private String pass;
	
	
	@Override
	public void init() throws ServletException 
	{
		// TODO Auto-generated method stub
		//super.init();
		
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String resultMessage = "";
		String name = req.getParameter("recipient");
		String subject = req.getParameter("subject");
		String content = req.getParameter("content");
		
		try 
		{
			EmailUtility.sendEmail(host,port,user,pass,name,subject,content);
			
			resultMessage = "The e-mail was sent successfully";
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultMessage = "There were an error: " + e.getMessage();
		}
		finally
		{
			req.setAttribute("Message", resultMessage);
			getServletContext().getRequestDispatcher("/Result.jsp").forward(req, resp);
		}
		
	
	}
}
