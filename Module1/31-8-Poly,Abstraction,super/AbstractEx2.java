package com.a318;


class A1
{
	void a1()
	{
		System.out.println("A1 Accessed");
	}
}

abstract class B1 extends A1
{
	abstract void b1();
	
	
}
class C1 extends B1
{
	
	void c1()
	{
		System.out.println("C Accessed");
	}

	@Override
	void b1() {
		// TODO Auto-generated method stub
		System.out.println("B Accessed");
	}
	
}

public class AbstractEx2 
{
	public static void main(String[] args) 
	{
		C1 c =new C1();
		
		c.a1();
		c.b1();
		c.c1();
		
	}
}
