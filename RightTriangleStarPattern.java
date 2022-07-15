package com.zohopackage;

public class RightTriangleStarPattern 
{
	public static void main(String[] args) 
	{
		int n = 6;
		for(int i = 0;i < n;i++)
		{
			for(int j = 1;j <= i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
