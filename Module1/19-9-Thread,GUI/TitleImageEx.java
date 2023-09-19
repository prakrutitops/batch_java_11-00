package com.a199;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class TitleImageEx 
{
	
	public TitleImageEx() 
	{
		Frame f=new Frame();     
		Image icon = Toolkit.getDefaultToolkit().getImage("E:\\photos\\add.png"); 
		f.setIconImage(icon);    
		f.setLayout(null);     
		f.setSize(400,400);     
		f.setVisible(true);     
	}
	public static void main(String[] args) 
	{
		new TitleImageEx();
	}
	
}
