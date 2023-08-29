package com.a298;

class P
{
	void p()
	{
		System.out.println("P Executed");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("Q Executed");
	}
}
interface R 
{
	void r();
	
}
class S extends Q implements R
{
	void s()
	{
		System.out.println("S Executed");
	}

	@Override
	public void r() 
	{
		// TODO Auto-generated method stub
		System.out.println("R Executed");
	}
}
public class HybridInEx 
{
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.p();
		s1.q();
		s1.r();
		s1.s();
	}
}
