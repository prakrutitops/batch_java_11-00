package com.a269;

import java.util.ArrayList;
import java.util.Iterator;

import com.a239.a;

public class ArrayListEx 
{
	
	public static void main(String[] args) 
	{
				//add
				//addAll
				//remove
				//removeAll
				//retainAll
				
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("android");
		arrayList.add("java");
		
		
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("php");
		arrayList2.add("Web Designing");
		arrayList2.add("ios");
		arrayList2.add("java");
		
		
	/*	arrayList.addAll(arrayList2);
		
		arrayList.remove(4);
		arrayList.remove(3);
		
		arrayList.removeAll(arrayList2);
	*/
		
		arrayList.retainAll(arrayList2);
		
		
		//fetch all details from list
		Iterator<String> i = arrayList.iterator();
		
		//hasnext will get index
		while(i.hasNext())
		{
			//value from index
			System.out.println(i.next());
		}
		
		/*
		 * for(Model m : arrayList) { System.out.println(m.id);
		 * System.out.println(m.name); }
		 */
		
	}
	
}
