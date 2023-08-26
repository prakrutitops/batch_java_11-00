package com.a268;

public class CopyConstructorEx 
{
	int id;
	String name;
	
	CopyConstructorEx(int i,String n) 
	{
		id=i;
		name = n;
	}
	CopyConstructorEx(CopyConstructorEx c)
	{
		id = c.id;
		name = c.name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		
		CopyConstructorEx c1 =new CopyConstructorEx(101,"Tops");
		CopyConstructorEx c2 =new CopyConstructorEx(c1);
		
		c1.display();
		c2.display();
		
	}
}
