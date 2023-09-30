package com.a309;

import java.util.ArrayList;
import java.util.Collections;

import com.a239.a;

class Student1 implements Comparable<Student1>
{
	int sid;
	String sname;
	
	public Student1(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		
		sid=id;
		sname=name;
	}
	
	@Override
	public int compareTo(Student1 o) 
	{
	
		int value=0;
		
		if(this.sid>o.sid)
		{
			return 1;
		}
		else if (this.sid<o.sid) 
		{
			return -1;
		}
		else if(this.sid==o.sid) 
		{
			return 0;
		}
		
		
		
		
		
		return 0;
	}
	
}

public class ComparableEx 
{
	public static void main(String[] args) 
	{
		
		Student1 s1 = new Student1(15, "Parth");
		Student1 s2 = new Student1(10, "Jay");
		Student1 s3 = new Student1(1, "Dhaval");
		Student1 s4 = new Student1(12, "RAhul");
		Student1 s5 = new Student1(7, "Tapan");
		
		
		ArrayList<Student1> arrayList =new ArrayList<Student1>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		
		
		Collections.sort(arrayList);
		
		for(Student1 sa1 : arrayList)
		{
			System.out.println(sa1.sid+" "+sa1.sname);
		}
		
		
	}
}


