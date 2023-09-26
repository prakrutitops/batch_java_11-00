package com.a269;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("android");
		linkedList.add("java");
		linkedList.add("android");
		linkedList.add("java");
		linkedList.add("android");
		linkedList.add("java");
		linkedList.addFirst("flutter");
		linkedList.addLast(null);
		
		
	
		//fetch all details from list
		Iterator<String> i = linkedList.iterator();
		
		//hasnext will get index
		while(i.hasNext())
		{
			//value from index
			System.out.println(i.next());
		}
		
	}
}
