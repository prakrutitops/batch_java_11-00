import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
	//signup
	
	public static int signupdata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into user(fname,lname,email,mobile,password) values (?,?,?,?,?)");
		
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getMobile());
			ps.setString(5, m.getPassword());
		
		
			status = ps.executeUpdate();
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	//Login
	
	public static Model checkLogin(Model m)
	{
		boolean flag = false;

		Model obj = null;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement  ps = con.prepareStatement("select * from user where mobile=? and password=?");
			ps.setString(1,m.getMobile());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				obj = new Model();
				obj.setId(set.getInt("id"));
				obj.setFname(set.getString("fname"));
				obj.setLname(set.getString("lname"));
				obj.setEmail(set.getString("email"));
				obj.setMobile(set.getString("mobile"));
				obj.setPassword(set.getString("password"));
				
				System.out.println(set.getString("fname"));
				System.out.println(set.getString("lname"));
				System.out.println(set.getString("email"));
				System.out.println(set.getString("mobile"));
				System.out.println(set.getString("password"));
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
}
