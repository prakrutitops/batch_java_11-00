package com.a149;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboboxEx 
{
	
	JFrame frame;
	JComboBox cb;
	String city[]= {"Rajkot","Ahmedabad","Baroda"};
	public ComboboxEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame =new JFrame();
		
		cb =new JComboBox<>(city);
		cb.setBounds(133, 11, 100, 22);
		
		//actionlistener
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
				String data = "Selected City is "+cb.getItemAt(cb.getSelectedIndex());
				System.out.println(data);
				
			}
		});
		
		frame.add(cb);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	
	}
	public static void main(String[] args)
	{
		new ComboboxEx();
	}
}
