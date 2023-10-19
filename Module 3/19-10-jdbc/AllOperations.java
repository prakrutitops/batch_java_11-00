package jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	
	JFrame inserframe,deleteframe,updateframe;
	JTextField tf1,tf2,tf3;
	JButton btn1,btndelete,btnupdate,btnedit;
	JPanel jp,jp2;
	int id1;
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
	
	public void viewdata()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="fingers";
		String url = host+db;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			
			String sql = "select * from data";
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("ID: NAME : SURNAME");
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				System.out.println(id+"    "+name+"    "+surname);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void deletedata()
	{
		deleteframe = new JFrame();
		
		tf3 = new JTextField(10);
		btndelete = new JButton("Delete");
		
		deleteframe.add(tf3);
		deleteframe.add(btndelete);
		
		
		btndelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
			
				
				String host="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String id = tf3.getText().toString();
					int myid = Integer.parseInt(id);
					
					String sql ="delete from data where id ='"+myid+"'";
					
					Statement stmt = con.createStatement();
					
					int data1 = stmt.executeUpdate(sql);
					
					if(data1>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Deletion Error");
					}
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
	}
	
	public void updatedata()
	{
		jp = new JPanel();
		jp2 = new JPanel();
		
		
		updateframe = new JFrame();
		
		tf1 =new JTextField(20);
		tf2 =new JTextField(20);
	
		btnupdate = new JButton("Update");
		
		jp2.add(tf1);
		jp2.add(tf2);
		jp2.add(btnupdate);
		
		
		
		//----------------------------------------------------
		
		
		tf3 = new JTextField(20);
		btnedit = new JButton("Edit");
		
		jp.add(tf3);
		jp.add(btnedit);
		
		jp2.setVisible(false);
		
		btnedit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				jp2.setVisible(true);
				jp.setVisible(false);
				
				String host="jdbc:mysql://localhost:3306/";
				String db="fingers";
				String url = host+db;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String id = tf3.getText().toString();
					int myid = Integer.parseInt(id);
					String sql ="Select * from data where id ='"+myid+"'";
					Statement stmt = con.createStatement();
					ResultSet set = stmt.executeQuery(sql);
					if(set.next())
					{
						id1 = set.getInt(1);
						String name1 = set.getString(2);
						String surname1 = set.getString(3);
					
						tf1.setText(name1);
						tf2.setText(surname1);
					}
					
					
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnupdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
				
					
					String sql ="update data set name='"+name+"',surname='"+surname+"' where id='"+id1+"'";
					
					
					
					Statement stmt = con.createStatement();
					
					int answer =stmt.executeUpdate(sql);
					
					if(answer>0)
					{
						updateframe.setVisible(false);
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
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
		
	}
			

}
