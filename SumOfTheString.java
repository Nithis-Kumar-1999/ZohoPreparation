package com.zohopackage;
import java.util.Scanner;

public class SumOfTheString 
{
		public static void main(String[] args) 
		{
			System.out.println("Enter a String");
			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
			scn.close();
			char ch [] = str.toCharArray();
			int sum = 0;
			for(int i = 0;i < str.length();i++)
			{
				sum += (int)ch[i] - 96;
			}
			System.out.println("Sum of the given String :"+sum);
			
		}
}
