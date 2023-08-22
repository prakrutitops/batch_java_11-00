package com.a228;

public class ParameterizedEx 
{
	//global variable
	int id;
	String name;
	
	public ParameterizedEx(int id,String name) 
	{
		//local variable
		
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) 
	{
		
		ParameterizedEx p1 = new ParameterizedEx(101,"Meet");
		ParameterizedEx p2 = new ParameterizedEx(102,"Deep");
		
		p1.display();
		p2.display();
		
		/*
		 * System.out.println(p1.id+" "+p1.name); System.out.println(p2.id+" "+p2.name);
		 */
		
	}
}
