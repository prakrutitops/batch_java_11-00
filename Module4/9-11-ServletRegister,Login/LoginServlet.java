import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String mob = req.getParameter("number");
		String pass = req.getParameter("password");
		
		Model m = new Model();
		m.setMobile(mob);
		m.setPassword(pass);
		
		Model m2 =Dao.checkLogin(m);
		
		if(m2!=null)
		{
			out.print("success");
			//resp.sendRedirect("");
		}
		else
		{
			out.print("fail");
		}
		
	}
}
