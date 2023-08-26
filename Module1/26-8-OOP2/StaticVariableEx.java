package com.a268;

public class StaticVariableEx 
{
	//variable
	static int count =0;
	//it can use old memory allocation if i will not use it , it will assign new memory everytime
	
	//Constructor -> default
	public StaticVariableEx() 
	{
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		
		StaticVariableEx s1 = new StaticVariableEx();
		StaticVariableEx s2 = new StaticVariableEx();
		StaticVariableEx s3 = new StaticVariableEx();
		
	}
}
