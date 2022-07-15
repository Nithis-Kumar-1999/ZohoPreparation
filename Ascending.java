package com.zohopackage;

public class Ascending 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,13,15,11,10};
		System.out.println("Before Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = i+1;j < arr.length;j++)
			if(arr[i]>arr[j])
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
