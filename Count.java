package com.zohopackage;

public class Count 
{
	public static void main(String[] args)
	{
		char [] ch = { 'c','h','e','n','n','a','i'};
		int n = ch.length;
		char value = 'a';
		int count = 0;
		for(int i = 0;i < n;i++)
		{
			if(ch[i] == value)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
