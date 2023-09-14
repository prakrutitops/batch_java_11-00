package com.a149;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelEx 
{
	
	JFrame frame;
	JPanel jp,jp2;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public PanelEx() 
	{
		// TODO Auto-generated constructor stub

		frame =new JFrame();
		
		jp =new JPanel();
		jp2 =new JPanel();
		
		tf1 =new JTextField(20);
		tf2 =new JTextField(20);
		tf3 =new JTextField(20);
		btn1 =new JButton("Submit");
		btn2 =new JButton("OK");
		
		jp.add(tf1);
		jp.add(btn1);
		
		
		jp2.add(tf2);
		jp2.add(tf3);
		jp2.add(btn2);
		
		frame.add(jp);
		frame.add(jp2);
		
		jp.setVisible(true);
		jp2.setVisible(false);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				jp.setVisible(false);
				jp2.setVisible(true);
				
				
				
			}
		});
		
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) 
	{
		new PanelEx();
	}
}
