package com.a239;

public class ThrowEx 
{
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Age is not valid");
			
		}
	}
	
	public static void main(String[] args) 
	{
		validate(17);
	}
}
