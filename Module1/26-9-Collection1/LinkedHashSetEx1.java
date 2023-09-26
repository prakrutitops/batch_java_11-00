package com.a269;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx1 
{
	public static void main(String[] args) 
	{
		
		LinkedHashSet<String>arrayList =new LinkedHashSet<>();
		
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
