package com.a219;

import javax.swing.*;


public class TableEx 
{
	JFrame frame;
	
	
	public TableEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame =new JFrame();
		//2d
		 String data[][]={ {"101","Amit","670000"},    
                 {"102","Jai","780000"},    
                 {"101","Sachin","700000"},{"101","Sachin","700000"}};   
		 
		 //1d
		 String column[]={"ID","NAME","SALARY"};     
		 
		 JTable jt=new JTable(data,column);    
		 jt.setBounds(30,40,200,300); 
		
		 JScrollPane sp=new JScrollPane(jt);    
		 frame.add(sp);        
		 
		
		 frame.setSize(500,500);
		 //frame.setLayout(null);
		 frame.setVisible(true);
	
		 
		 
	}
	public static void main(String[] args) {
		
		new TableEx();
	}
}
