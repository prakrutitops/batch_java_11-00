package com.a129;

import java.util.Scanner;

public class TcEx 
{
	
	static int age;
	public static void main(String[] args) 
	{
		
		try
		{
			System.out.println("Enter Your Age");
			Scanner sc =new Scanner(System.in);
			age = sc.nextInt();
			if(age>18)
			{
				System.out.println("eligible to vote");
			}
			else
			{
				System.out.println("not eligible to vote");
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed");
		}
		
	}
}
