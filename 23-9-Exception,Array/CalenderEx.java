package com.a239;

import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;

public class CalenderEx 
{
	JDateChooser dateChoose;
	JFrame frame;
	
	public CalenderEx()
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		dateChoose = new JDateChooser();
		dateChoose.setBounds(115, 246, 200, 20);
		frame.add(dateChoose);
		
		frame.setSize(500,500);
		frame.setLayout(null);;
		frame.setVisible(true);;
		
	
	}
	
	public static void main(String[] args) 
	{
		
		new CalenderEx();
		
	}
	
}
