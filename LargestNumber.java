package com.zohopackage;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		int arr[] = {16,17,18,15,14};
		int large = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>large)
			{
				large = arr[i];
			}
		}
		System.out.println("largest number in the array: " + large);  
	}
}