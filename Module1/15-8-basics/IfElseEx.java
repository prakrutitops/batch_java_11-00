package com.a158;

public class IfElseEx 
{
	
	public static void main(String[] args) 
	{
		
		int age = 65;
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
			
			//nested if
			if(age>=60)
			{
				System.out.println("Senior citizen");
			}
			else
			{
				System.out.println("Young age");
			}
			
			
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		
		
	}
}
