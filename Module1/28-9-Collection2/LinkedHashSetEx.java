package com.a289;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		//Data Order will arrange according to Hashvalue
		
		LinkedHashSet<String>set =new LinkedHashSet<>();
		
		set.add("ankit");
		set.add("chirag");
		set.add("bony");
		set.add("deep");
		set.add("fatema");
		set.add("elephant");
		
		Iterator<String>i = set.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println(i.next());
			
		}
		
		
		
	}
}
