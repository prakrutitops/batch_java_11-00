package com.a268;

class A1
{
	void a()
	{
		System.out.println("a");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("b");
	}
}

class C1 extends B1
{
	void c()
	{
		System.out.println("c");
	}
}

public class MultiLevelEx 
{
	public static void main(String[] args) {
		
		C1 c =new C1();
		
		c.a();
		c.b();
		c.c();
	
	}
}
