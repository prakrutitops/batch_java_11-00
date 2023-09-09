package com.a99;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameEx implements ActionListener
{
	JFrame frame;
	JLabel l1,l2;
	JTextField tf1,tf2,tf3;
	JButton btn1,btn2;
	
	public FrameEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		
		
		l1 =new JLabel("Enter Your 1st Value: ");
		l1.setBounds(4, 10, 146, 14);
		
		tf1 =new JTextField();
		tf1.setBounds(140, 10, 186, 20);
		
		l2 =new JLabel("Enter Your 2nd Value: ");
		l2.setBounds(4, 40, 146, 14);
		
		tf2 =new JTextField();
		tf2.setBounds(140, 40, 186, 20);
		
		tf3 =new JTextField();
		tf3.setBounds(140, 70, 186, 20);
		tf3.setEditable(false);
		
		btn1 =new JButton("+");
		btn1.setBounds(150, 104, 45, 29);
		
		btn2 =new JButton("-");
		btn2.setBounds(220, 104, 45, 29);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		
		
		new FrameEx();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c=0;
		
		if(e.getSource()==btn1)
		{
			c = Integer.parseInt(a)+Integer.parseInt(b);
			tf3.setText(String.valueOf(c));
		}
		
		if(e.getSource()==btn2)
		{
			c = Integer.parseInt(a)-Integer.parseInt(b);
			tf3.setText(String.valueOf(c));
		}
	}
	
}
