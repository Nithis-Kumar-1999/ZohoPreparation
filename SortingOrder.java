package com.zohopackage;

public class SortingOrder 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,3,9,8};
		System.out.println("Before Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int temp = 0;
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = i+1;j < arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
