package com.a169;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MenuEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JMenuBar menubar;
	JMenu File,Edit,Help,Submenu;
	JMenuItem i1,i2,i3,i4,i5;
	JTextArea ta;
	
	public MenuEx() 
	{
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		menubar =new JMenuBar();
		
		
		File =new JMenu("File");
		Edit =new JMenu("Edit");
		Help =new JMenu("Help");
		Submenu =new JMenu("Submenu");
		
		i1 =new JMenuItem("Cut");
		i2 =new JMenuItem("Copy");
		i3 =new JMenuItem("Paste");
		i4 =new JMenuItem("SelectAll");
		i5 =new JMenuItem("Data");
		
		
		
		File.add(Submenu);
		Submenu.add(i5);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		
		Edit.add(i1);
		Edit.add(i2);
		Edit.add(i3);
		Edit.add(i4);
		//Edit.add(i5);
		
	
		
		menubar.add(File);
		menubar.add(Edit);
		menubar.add(Help);
		
		
		ta = new JTextArea();
		
		
	
		
		//frame.add(menubar);
		frame.addWindowListener(this);
		frame.setJMenuBar(menubar);
		frame.add(ta);
		frame.setSize(500,500);
		
		frame.setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		new MenuEx();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== i1)
		{
			ta.cut();
		}
		if(e.getSource()== i2)
		{
			ta.copy();
		}
		if(e.getSource()== i3)
		{
			ta.paste();
		}
		if(e.getSource()== i4)
		{
			ta.selectAll();
		}
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		super.windowClosing(e);
	
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		int a = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?");
		
		if(a==JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
		if(a==JOptionPane.NO_OPTION)
		{
			
		}
		if(a==JOptionPane.CANCEL_OPTION)
		{
			
		}
	}
	
	
}
