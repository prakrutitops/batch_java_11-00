package com.a199;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class BoxLayoutEx extends Frame
{
	Button buttons[];  
	
	public BoxLayoutEx() 
	{
	
		buttons = new Button [5];  
		    
		   for (int i = 0;i<5;i++) 
		   {  
		      buttons[i] = new Button ("Button " + (i + 1));  
		      add (buttons[i]);  
		    }  
		   
		   setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
		   setSize(400,400);  
		   setVisible(true); 
		
	}
	public static void main(String[] args)
	{
		
		new BoxLayoutEx();
		
	}
}
