package com.zohopackage;

public class BasicString 
{
	public static void main(String[] args)
	{
		String str = "Chennai Super Kings";
		String [] arr = str.split(" ");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
