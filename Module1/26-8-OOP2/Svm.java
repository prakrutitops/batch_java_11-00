package com.a268;

public class Svm 
{
	//Data members
	int id;
	String name;
	static String college="Atmiya";
	
	//constructor->para
	public Svm(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		this.id=id;
		this.name=name;
	}
	//method
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	//main method
	
	static void change()
	{
		college="VVP";
	}
	
	public static void main(String[] args) 
	{
		Svm s1 =new Svm(101, "Meet");
		Svm s2 =new Svm(102, "Deep");
	
		change();
		
		s1.display();
		s2.display();
		
	}
	
}
