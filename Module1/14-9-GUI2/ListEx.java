package com.a149;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListEx 
{
	
	JFrame frame;
	JList list;
	
	public ListEx() 
	{
		// TODO Auto-generated constructor stub
		frame =new JFrame();
		
		
	
		DefaultListModel<String> l1 = new DefaultListModel<>();  
		
		l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
		
        list =new JList<>(l1);
		list.setBounds(100,100, 75,575);
        
		frame.add(list);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		
		new ListEx();
		
	}
}
