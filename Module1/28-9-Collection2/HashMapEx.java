package com.a289;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> map = new HashMap<>();
		
		//put,get
		
		map.put("A",101);
		map.put("B",102);
		map.put("C",103);
		map.put("D",104);
		
		//System.out.println(map.get("A"));
		
		for(Map.Entry<String,Integer> m : map.entrySet())
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}
}
