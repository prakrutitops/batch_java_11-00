package com.a318;

public class OverloadingEx1
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	static int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		//OverloadingEx1 o1 =new OverloadingEx1();
		
		System.out.println(cal(6,5));
		System.out.println(cal(2,3,4));
	}
}
