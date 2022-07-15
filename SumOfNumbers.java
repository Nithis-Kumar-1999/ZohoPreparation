package com.zohopackage;
import java.util.Scanner;

public class SumOfNumbers
{
	public static void main(String[] args) 
	{
		int sum = 0;
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int  num = scn.nextInt();
		scn.close();
		 for (int i = 0; i<num; i++)
		 {
	         sum = sum +i;
	      }
		System.out.println("Sum of Numbers is:"+ sum);	
	}
}