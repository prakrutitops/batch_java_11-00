package com.a129;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class File2 extends WindowAdapter implements ActionListener 
{
	JFrame frame;
	JLabel l1;
	JCheckBox chk1,chk2,chk3;
	JButton btn1;
	
	
	public File2() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame("Cafe Ordering System");
		
		l1 =new JLabel("Menu Items");
		l1.setBounds(200, 11, 146, 34);
		
		chk1 =new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(90, 46, 197, 23);
		
		chk2 =new JCheckBox("Burger @ Rs. 70");
		chk2.setBounds(90, 76, 197, 23);
		
		chk3 =new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(90, 106, 197, 23);
		
		btn1 =new JButton("Order");
		btn1.setBounds(90, 150, 100, 23);
		
		btn1.addActionListener(this);
		frame.addWindowListener(this);
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int amount = 0;
		StringBuffer sf =new StringBuffer("\n Selected Items");
		
		if(chk1.isSelected())
		{
			amount+=100;
			sf.append("\n Pizza @ Rs. 100");
		}
		if(chk2.isSelected())
		{
			amount+=70;
			sf.append("\n Burger @ Rs. 70");
		}
		if(chk3.isSelected())
		{
			amount+=120;
			sf.append("\n Coffee @ Rs. 120");
		}
		sf.append("\n Total :"+amount);
		
		//System.out.println(sf.toString());
		JOptionPane.showMessageDialog(frame,sf.toString());
	
		
	
}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		int a = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
		
		if(a== JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(a== JOptionPane.NO_OPTION)
		{
			
		}
		if(a== JOptionPane.CANCEL_OPTION)
		{
			
		}
	
	}
}
