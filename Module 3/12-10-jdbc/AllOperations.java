package jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	
	JFrame inserframe;
	JTextField tf1,tf2;
	JButton btn1;
	
	public void insertdata()
	{
		inserframe = new JFrame();
		
		tf1 =new JTextField(20);
		tf2 =new JTextField(20);
		btn1 =new JButton("INSERT");
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String host ="jdbc:mysql://localhost:3306/";
				String db ="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, "root", "");
					
					String name = tf1.getText().toString();
					String surname = tf2.getText().toString();
				
					String sql ="insert into data values (null,'"+name+"','"+surname+"')";
					
					Statement stmt = con.createStatement();
					
					int answer =stmt.executeUpdate(sql);
					
					if(answer>0)
					{
						inserframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}//connect with driver
				
				
				
				
				
				
				
			}
		});
		
		inserframe.add(tf1);
		inserframe.add(tf2);
		inserframe.add(btn1);
		
		inserframe.setSize(500,500);
		inserframe.setLayout(new FlowLayout());
		inserframe.setVisible(true);
	}
}
