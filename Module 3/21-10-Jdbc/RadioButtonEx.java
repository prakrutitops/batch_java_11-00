package com.data;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonEx implements ActionListener
{
	JFrame frame;
	JRadioButton rb1,rb2;
	JPanel jp,jp2;
	
	JLabel l1,l2;
	JTextField tf1,tf2,tf3,tf4;
	JButton btn1,btn2;
	String iname,ipass,iname2,ipass2;
	
	public RadioButtonEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		l1 = new JLabel("Admin");
		l1.setBounds(193, 76, 46, 14);
		
		l2 = new JLabel("Manager");
		l2.setBounds(193, 76, 146, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(171, 101, 86, 20);
		
		tf2 =new JTextField();
		tf2.setBounds(171, 134, 86, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(171, 101, 86, 20);
		
		tf4 =new JTextField();
		tf4.setBounds(171, 134, 86, 20);
		
		btn1 =new JButton("Login");
		btn1.setBounds(171, 178, 89, 23);
		
		btn2 =new JButton("Login");
		btn2.setBounds(171, 178, 89, 23);
		
		
		jp = new JPanel();
		jp.add(l1);
		jp.add(tf1);
		jp.add(tf2);
		jp.add(btn1);
		jp.setSize(500,500);
		jp.setLayout(null);
		jp.setVisible(false);
		
		jp2 = new JPanel();
		jp2.add(l2);
		jp2.add(tf3);
		jp2.add(tf4);
		jp2.add(btn2);
		jp2.setSize(500,500);
		jp2.setLayout(null);
		jp2.setVisible(false);
		
		rb1 =new JRadioButton("Admin");
		rb1.setBounds(83, 7, 109, 23);
		
		rb2 =new JRadioButton("Manager");
		rb2.setBounds(253, 7, 109, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(jp);
		frame.add(jp2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	
	public static void main(String[] args)
	{
		new RadioButtonEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==rb1)
		{
			
			jp.setVisible(true);
			jp2.setVisible(false);
		}
		if(e.getSource()==rb2)
		{
			jp.setVisible(false);
			jp2.setVisible(true);
		}
		if(e.getSource()==btn1)
		{
			
			String name = tf1.getText().toString();
			String pass = tf2.getText().toString();
			
			String host ="jdbc:mysql://localhost:3306/";
			String db="fingers";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				String sql ="select name,pass from admin where name='"+name+"'";
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(sql);

				if(set.next())
				{
					
					 iname = set.getString(1);
					 ipass = set.getString(2);
						
					if(pass.equals(ipass))
					{
						JOptionPane.showMessageDialog(frame,"logged in succesfully");
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"password is wrong");
					}
					
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"No USer Found");
				}
			
			}
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
			
			
		}
		if(e.getSource()==btn2)
		{
			
			String name = tf3.getText().toString();
			String pass = tf4.getText().toString();
			
			String host ="jdbc:mysql://localhost:3306/";
			String db="fingers";
			String url = host+db;
			
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,"root","");
				String sql ="select name,pass from manager where name='"+name+"'";
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(sql);

				if(set.next())
				{
					
					 iname2 = set.getString(1);
					 ipass2 = set.getString(2);
						
					if(pass.equals(ipass2))
					{
						JOptionPane.showMessageDialog(frame,"logged in succesfully");
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"password is wrong");
					}
					
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame,"No USer Found");
				}
			
			}
			catch (Exception e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
