package com.a29;

public class StringEx2 
{
	public static void main(String[] args) {
		
		//compare
		
		String s1 ="sachin";
		String s2="sachin";
		String s3 =new String("sachin");
		String s4="saurav";
		String s5="SACHIN";
		String s6="Java is a Programming Language. Java is a Open Source Platform. Java is a secure Language";
		
		//equals -> value check
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println("---------------------------");
		
		//equalsignorecase
		
		System.out.println(s1.equalsIgnoreCase(s5));
		
		//==[also check initialization way]
		System.out.println("---------------------------");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);
		
		//compareto
		System.out.println("---------------------------");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
	
	
		System.out.println(s6.replace("Java", "Tops"));	
	
	}
}
