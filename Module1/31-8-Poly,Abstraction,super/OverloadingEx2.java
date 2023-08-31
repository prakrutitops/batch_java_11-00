package com.a318;

public class OverloadingEx2 
{
	
	static int cal(int a,int b)
	{
		return a+b;
	}
	static double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		//OverloadingEx1 o1 =new OverloadingEx1();
		
		System.out.println(cal(6,5));
		System.out.println(cal(2.00,3.00));
	}
}
