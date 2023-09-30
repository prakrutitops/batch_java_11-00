package com.a309;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationEx2 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream("E://xyz.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id+" "+s.name);
		
	}
}
