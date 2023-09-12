package com.a129;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class File1 implements ActionListener
{
	JFrame frame;
	JLabel l1,l2;
	JTextField tf1;
	JPasswordField tf2;
	JButton btn1;
	
	
	public File1() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		l1 =new JLabel("Enter Your Email: ");
		l1.setBounds(77, 11, 150, 14);
		
		l2 =new JLabel("Enter Your Password:");
		l2.setBounds(77, 49, 150, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(220, 8, 186, 20);
		
		tf2 =new JPasswordField();
		tf2.setBounds(220, 46, 186, 20);
		
		btn1 =new JButton("Login");
		btn1.setBounds(180, 100, 86, 20);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btn1.addActionListener(this);
		
		
	
	}
	public static void main(String[] args) {
		
		new File1();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			String email = tf1.getText().toString();
			String pass = tf2.getText().toString();
		
			if(pass.equals("1234"))
			{
				new File2();
			}
			else
			{
				System.out.println("Your credentials are wrong");
			}
		
		}
	}
	
}
