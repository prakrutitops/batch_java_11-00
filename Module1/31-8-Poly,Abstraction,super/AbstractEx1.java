package com.a318;


class A
{
	//non abstract method
	void a()
	{
		
	}
	
	//abstract method
	//abstract void b();
}

abstract class B extends A
{
	//abstract method
	abstract void b();
	
	//non abstract method
	void c()
	{
		
	}
}
class C extends B
{

	@Override
	void b() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractEx1 
{
	public static void main(String[] args) 
	{
		
	}
}
