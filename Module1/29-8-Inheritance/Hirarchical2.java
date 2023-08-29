package com.a298;


class A
{
	int a,b;
	
	void a(int a1,int b1)
	{
		a=a1;
		b=b1;
	}
	
	void display()
	{
		/*
		 * System.out.println(a); System.out.println(b);
		 */
	
		int c = a+b;
		System.out.println(c);
	}
	
}
class B extends A
{
	
}
class C extends B
{
	
}

public class Hirarchical2 
{
	public static void main(String[] args) {
		
		
		C c1 =new C();
		c1.a(5, 2);
		c1.display();
		
	}
}
