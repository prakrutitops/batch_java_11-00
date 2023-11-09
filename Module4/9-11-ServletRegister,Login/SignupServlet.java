import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String password = req.getParameter("password");
		
		Model m = new Model();
		
		m.setFname(fname);
		m.setLname(lname);
		m.setEmail(email);
		m.setMobile(mobile);
		m.setPassword(password);
		
		int data = Dao.signupdata(m);
		
		if(data>0)
		{
			out.print("success");
			resp.sendRedirect("login.html");
		}
		else
		{
			out.print("fail");	
		}
		
		
		
	}
}
