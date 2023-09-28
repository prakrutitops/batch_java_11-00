package com.a289;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx 
{
	//add,addAll,remove,removeAll,retainAll
	
	public static void main(String[] args) 
	{
		//Data Order will arrange according to Hashvalue
		
		HashSet<String>set =new HashSet<>();
		
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
