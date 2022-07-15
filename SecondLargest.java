package com.zohopackage;

public class SecondLargest
{
	public static void main(String[] args) 
	{
		int arr [] = {14,16,18,17,12};
		int large = arr[0];
		int slarge = arr[1];
		int n = arr.length;
		for(int i = 0; i < n;i++)
		{
			if(arr[i]>large)
			{
				slarge = large;
				large = arr[i];
			}
			else if(arr[i]>slarge)
			{
				slarge = arr[i];
			}
		}
		System.out.println(slarge);
		System.out.println(large);
	}
}
