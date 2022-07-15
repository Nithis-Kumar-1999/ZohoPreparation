package com.zohopackage;
import java.util.Scanner;

public class OddNumber 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		scn.close();
		if(num%2!=0)
		{
			System.out.println("The given Odd Number is "+num);
		}
		else
		{
			System.out.println("The given Even Number is "+num);
		}
	}
}