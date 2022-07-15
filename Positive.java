package com.zohopackage;
import java.util.Scanner;

public class Positive 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		if(num>0)
		{
			System.out.println("The given number is Positive");
		}
		else
			System.out.println("Negative number");
	}
}