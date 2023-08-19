package com.a198;

import java.util.Scanner;

public class GraddingEx 
{
	
	//static int maths_marks=56,science_marks=65,english_marks=78;
	static int total = 0;
	
	
	public static void main(String[] args) 
	{
			
		Scanner sc = new Scanner(System.in);//scanf
		
		System.out.println("Enter Your Maths Marks");
		int maths_marks = sc.nextInt();
		
		System.out.println("Enter Your Science Marks");
		int science_marks = sc.nextInt();
		
		System.out.println("Enter Your English Marks");
		int english_marks = sc.nextInt();
		
		total = maths_marks+science_marks+english_marks;
		System.out.println("Total Marks is: "+total);
		
		
		if(total>=250)
		{
			System.out.println("A Grade");
		}
		else if(total>=200)
		{
			System.out.println("B Grade");
		}
		else if(total>=150)
		{
			System.out.println("C Grade");
		}
		else if(total>=105)
		{
			System.out.println("Passing Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
