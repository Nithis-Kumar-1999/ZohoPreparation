package com.zohopackage;

public class MinimumAndMaximumElement 
{
	static class Element 
	{
		int min;
		int max;
	}
	static Element getMinMax(int arr[], int n) 
	{
		Element minmax = new Element();
		int i;
		if (n == 1)
		{
			minmax.max = arr[0];
			minmax.min = arr[0];
			return minmax;
		}
		if (arr[0] > arr[1]) 
		{
			minmax.max = arr[0];
			minmax.min = arr[1];
		} 
		else 
		{
			minmax.max = arr[1];
			minmax.min = arr[0];
		}

		for (i = 2; i < n; i++) 
		{
			if (arr[i] > minmax.max) 
			{
				minmax.max = arr[i];
			} 
			else if (arr[i] < minmax.min) 
			{
				minmax.min = arr[i];
			}
		}
		return minmax;
	}

	public static void main(String[] args)
	{
		int arr[] = {3, 2, 1, 56, 10000, 167};
		int N = arr.length;
		Element minmax = getMinMax(arr, N);
		System.out.printf("\nMinimum Element is %d", minmax.min);
		System.out.printf("\nMaximum Element is %d", minmax.max);
	}
}
