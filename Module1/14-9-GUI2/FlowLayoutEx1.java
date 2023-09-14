package com.a149;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 
{
	JFrame frame;
	JButton btn1,btn2,btn3,btn4;
	
	public FlowLayoutEx1() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		btn1 =new JButton("Submit76t6ututyutyutyutyutyu");
		btn2 =new JButton("A2");
		btn3 =new JButton("A3");
		btn4 =new JButton("A4");
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new FlowLayoutEx1();
		
	}
}
