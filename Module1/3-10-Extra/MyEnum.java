package com.a310;

enum Student 
{
	John(10), Bella(20), Sam(30), Viraaj(40);
	
	private int age;
	
	private Student(int age) 
	{
		this.age= age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

public class MyEnum 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Age of Viraaj is " +Student.Viraaj.getAge()+ " years");
	}
}

//class
//object
//method call


//Enumname.variablename.methodname
