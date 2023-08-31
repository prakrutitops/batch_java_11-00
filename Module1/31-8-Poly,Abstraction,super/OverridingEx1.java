package com.a318;

class RBI
{
	int rate()
	{
		return 0;
	}
}

class Sbi extends RBI
{
	int rate()
	{
		return 7;
	}
}
class Icici extends RBI
{
	int rate()
	{
		return 8;
	}
}
class Axis extends RBI
{
	int rate()
	{
		return 9;
	}
}

public class OverridingEx1 
{
	public static void main(String[] args) 
	{
		RBI r;
		
		r = new Sbi();
		System.out.println(r.rate());
		
		r = new Icici();
		System.out.println(r.rate());
		
		r = new Axis();
		System.out.println(r.rate());
		
		
		
	}
}
