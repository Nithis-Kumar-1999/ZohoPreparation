package com.zohopackage;

public class Descending 
{
	public static void main(String[] args)
	{
		int arr[] = {15,16,18,12,13};
		System.out.println("Before Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = i+1;j < arr.length;j++)
			if(arr[i]<arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("\nAfter Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
