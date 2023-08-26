package com.a268;

class A
{
	void a()
	{
		System.out.println("a");
	}
}
class B extends A
{
	void b()
	{
		System.out.println("b");
	}
}

public class SingleInex 
{
	public static void main(String[] args) {
		
	
		B b1 =new B();
		
		b1.a();
		b1.b();
		
	}
}
