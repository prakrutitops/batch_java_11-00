package com.a298;


class Shape
{
	int a,b;
	
	void getdetail(int m,int n)
	{
		a=m;
		b=n;
	}
}


class Rec extends Shape
{
	void area_rec()
	{
		int area = a*b;
		System.out.println(area);
	}
}

class Circle extends Shape
{
	void area_cir()
	{
		float area = (float) (3.14*a*a);
		System.out.println(area);
	}
}



public class Hirarchical3 
{
	public static void main(String[] args) 
	{
		
		Rec r1 =new Rec();
		Circle c1 =new Circle();
		
		r1.getdetail(5,6);
		r1.area_rec();
		
		c1.getdetail(5,6);
		c1.area_cir();
		
		
	}
}
