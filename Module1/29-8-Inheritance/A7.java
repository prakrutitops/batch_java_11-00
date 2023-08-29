package com.a298;

interface Print
{
	void print();
	
}
interface Show
{
	void show();
}

public class A7 implements Print,Show
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Printing");
	}
	
	public static void main(String[] args) {
		
		A7 a =new A7();
		a.print();
		a.show();
		
	}

	

}
