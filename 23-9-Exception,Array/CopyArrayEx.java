package com.a239;

public class CopyArrayEx 
{
	
	public static void main(String[] args) 
	{
		
		int A[] = {1,2,6,3,4};
		
		int B[] = new int[10];
		
		System.arraycopy(A, 1, B, 3, 3);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(B[i]);
		}
		
		
	}
	
	
}
