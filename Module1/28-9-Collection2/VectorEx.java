package com.a289;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) {
		
		Vector v =new Vector<>(5);
		
		v.add("a");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("b");
		v.add("b");
		v.add("a");
		v.add("b");
		v.add("a");
		v.add("b");
		v.add("d");
		
		
		System.out.println("Vector Size: "+v.size());
		System.out.println("Vector Capactity: "+v.capacity());
		System.out.println();
		
		if(v.contains("r"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
