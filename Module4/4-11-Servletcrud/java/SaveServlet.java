import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
				resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
		
		
				String name = req.getParameter("name");
				String surname = req.getParameter("surname");
				String email = req.getParameter("email");
				
				
				Model m = new Model();
				m.setName(name);
				m.setSurname(surname);
				m.setEmail(email);
				
				int data = Dao.insertdata(m);
				
				if(data>0)
				{
					//out.print("success");
					resp.sendRedirect("ViewServlet");
				}
				else
				{
					out.print("fail");
				}
				
				
				
//System.out.println(name+" "+surname+" "+email);
				
//				out.print("Your Name is : "+name);
//				out.print("<br>");
//				out.print("Your Surname is : "+surname);
//				out.print("<br>");
//				out.print("Your Email is : "+email);
	
				
				
	}
}
