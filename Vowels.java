package com.zohopackage;

public class Vowels
{
	public static void main(String[] args)
	{
		String str = "Chennai Super Kings";
		char ch [] = str.toCharArray();
		for(int i = 0;i<str.length();i++)
		{
			if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u'))
			{
				System.out.print(ch[i]);
			}
		}
	}
}
