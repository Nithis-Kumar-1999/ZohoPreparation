package com.zohopackage;

public class XPattern 
{
	static void pattern(String str,int n)
	{
		for (int i = 0; i < n; i++)
		{
			int j = n - 1 - i;
			for (int k = 0; k < n; k++)
			{
				if (k == i || k == j)
                System.out.print(str.charAt(k));
				else
                System.out.print(" ");
			}
			System.out.println("");
		}
	}
    
	public static void main(String[] args) 
	{
		String str = "program";
		int n = str.length();
		pattern(str, n);
	}
}
