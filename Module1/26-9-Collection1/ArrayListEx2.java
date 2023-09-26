package com.a269;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>arrayList =new ArrayList<>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("a");
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
