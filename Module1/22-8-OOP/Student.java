package com.a228;

public class Student 
{
	//variables ,data memebers
	int id;
	String name;
	
	//main method
	public static void main(String[] args) 
	{
		
		
		Student s1 = new Student();//object
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.id=101;//value assign
		s1.name="Deep";
		
		s2.id=102;
		s2.name="Meet";
		
		s3.id=103;
		s3.name="vivek";
		
		//print
		System.out.println("\n Your Id Is: "+s1.id+" \n Your Name is :"+s1.name);
		System.out.println("\n Your Id Is: "+s2.id+" \n Your Name is :"+s2.name);
		System.out.println("\n Your Id Is: "+s3.id+" \n Your Name is :"+s3.name);
	}
	
}
