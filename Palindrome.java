package com.zohopackage;
import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		int rev = 0;
		int pal = num;
		while(num>0)
		{
			int t = num%10;
			rev = rev*10+t;
			num = num/10;
		}
		if(pal == rev)
		{
			System.out.println("The given number is palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}
}