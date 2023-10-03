package com.a310;

public class FinalizeEx 
{
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Garbage colletion called");
	}
	
	
	public static void main(String[] args) 
	{
		
		FinalizeEx e1 = new FinalizeEx();
		FinalizeEx e2 = new FinalizeEx();
		FinalizeEx e3 = new FinalizeEx();
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.gc();
	}
}
