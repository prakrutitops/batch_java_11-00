package com.a318;

class Color
{
	String color="black";
	
}
class Color2 extends Color
{
	String color="white";
	
	void display()
	{
		System.out.println(color);//current class value
		System.out.println(super.color);//parent class value
	}
}

public class SuperEx 
{
	public static void main(String[] args) 
	{
		
		
		Color2 c =new Color2();
		c.display();
		
	}
}
