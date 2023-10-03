package com.a310;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteEx 
{
	public static void main(String[] args) throws IOException {
		
		FileWriter fw =new FileWriter("E://meet1.txt");
		String s = "Welcome to tops";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("success");
		
		FileReader fr =new FileReader("E://meet1.txt");
		
		int i= 0;
		while((i = fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
