package com.a29;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx1 
{
	public static void main(String[] args) throws IOException 
	{
		String s ="welcome to tops";
		FileOutputStream fout = new FileOutputStream("H://deep.txt");
		fout.write(s.getBytes());
		System.out.println("success");
		
	}
}
