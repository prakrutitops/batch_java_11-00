package com.a99;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormEx implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5;
	JTextField tf1,tf2,tf3;
	JPasswordField tf4,tf5;
	JButton btn1;

	public FormEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		l1 =new JLabel("First Name");
		l1.setBounds(55, 25, 146, 14);
		
		l2 =new JLabel("Last Name");
		l2.setBounds(55, 65, 146, 14);
		
		l3 =new JLabel("Email");
		l3.setBounds(55, 105, 146, 14);
		
		l4 =new JLabel("Password");
		l4.setBounds(55, 145, 146, 14);
		
		l5 =new JLabel("Confirm Password");
		l5.setBounds(55, 185, 146, 14);
		
		tf1 = new JTextField();
		tf1.setBounds(170, 22, 186, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(170, 62,186, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(170, 102, 186, 20);
		
		tf4 = new JPasswordField();
		tf4.setBounds(170, 142, 186, 20);
		
		tf5 = new JPasswordField();
		tf5.setBounds(170, 182, 186, 20);
		
		btn1 =new JButton("Submit");
		btn1.setBounds(220, 220, 86, 30);
		
		btn1.addActionListener(this);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(tf4);
		frame.add(tf5);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}	
	public static void main(String[] args)
	{
		new FormEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			String fname = tf1.getText().toString();
			String lname = tf2.getText().toString();
			String email= tf3.getText().toString();
			String pass = tf4.getText().toString();
			String cpass = tf5.getText().toString();
			
			String fname1 = "\n Your FirstName:"; 
			String lname1 = "\n Your LastName:"; 
			String email1= "\n Your Email:"; 
			String pass1 = "\n Your Password:"; 
			String cpass1 = "\n Your Confirm Password:"; 
			
			
			if(pass.equals(cpass))
			{
				try 
				{
					FileOutputStream fout = new FileOutputStream("E://details.txt");
					fout.write(fname1.getBytes());
					fout.write(fname.getBytes());
					fout.write(lname1.getBytes());
					fout.write(lname.getBytes());
					fout.write(email1.getBytes());
					fout.write(email.getBytes());
					fout.write(pass1.getBytes());
					fout.write(pass.getBytes());
					fout.write(cpass1.getBytes());
					fout.write(cpass.getBytes());
				
					System.out.println("Executed");
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				System.out.println("Your Password and Confirm Password are not same");
			}
			}
	}
	
}
