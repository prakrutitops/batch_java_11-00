package com.a149;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 /* implements ActionListener */
{
	
	JFrame frame;
	JButton btn1,btn2,btn3;
	
	
	public Test2() 
	{
		
		frame =new JFrame();
		
		btn1 =new JButton("Submit");
		btn1.setBounds(100, 100, 50, 50);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//btn1.addActionListener(this);
		
		
		
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Test2();
	}
	
	/*
	 * @Override public void actionPerformed(ActionEvent e) {
	 * 
	 * if(e.getSource()==btn1) { System.out.println("a"); } }
	 */
}
