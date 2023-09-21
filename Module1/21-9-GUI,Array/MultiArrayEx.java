package com.a219;

public class MultiArrayEx 
{
	public static void main(String[] args) 
	{
		
		int data [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("martix is ["+i+"] ["+j+"] = "+data[i][j]);
			}
			System.out.println();
				
		}
		
	}
}
