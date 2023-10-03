package com.a310;

import java.io.File;
import java.io.IOException;

public class FileEx2 
{
	public static void main(String[] args) throws IOException 
	{
		FileEx2 f2 =new FileEx2();
		
		File file = new File("E://MyFile.txt");
		file.createNewFile();
		
		f2.getFileDetails(file);
		
	}

	private void getFileDetails(File file) 
	{
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.lastModified());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		
		
		
		
	}
}
