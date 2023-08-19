package com.a198;

import java.util.Scanner;

public class SwitchEx 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);//fixed
		
		System.out.println("Enter Your Number");//printf
		int num = sc.nextInt();//scanf
		
		switch(num)
		{
			case 1: System.out.println("English");
			break;
			
			case 2: System.out.println("Hindi");
			break;
			
			case 3:System.out.println("Gujarati");
			break;
		}
		
		
	}
}
