package com.a228;

public class Student2 
{
	//variables ,data memebers
	int id;
	String name,surname,email,mobile;
	
	
	void display()
	{
		System.out.println("\n Your id is :"+id+"\n Your Name is: "+name+"\n Your Email is : "+email+"\n Your Mobile is :"+mobile+"\n Your Surname is :"+surname);
	}
	
	
	//main method
	public static void main(String[] args) 
	{
		
		
		Student2 s1 = new Student2();//object
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		Student2 s4 = new Student2();
		Student2 s5 = new Student2();
		
		s1.id=101;//value assign
		s1.name="Deep";
		s1.surname="a";
		s1.email="d@gmail.com";
		s1.mobile="1234";
		
		s2.id=102;//value assign
		s2.name="Meet";
		s2.surname="b";
		s2.email="m@gmail.com";
		s2.mobile="1234";
		
		s3.id=103;//value assign
		s3.name="a";
		s3.surname="b";
		s3.email="a@gmail.com";
		s3.mobile="1234";
		
		s4.id=104;//value assign
		s4.name="c";
		s4.surname="d";
		s4.email="d@gmail.com";
		s4.mobile="1234";
		
		s5.id=105;//value assign
		s5.name="p";
		s5.surname="q";
		s5.email="p@gmail.com";
		s5.mobile="1234";
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
	
	}
	
}
