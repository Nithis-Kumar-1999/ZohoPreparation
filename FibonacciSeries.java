package com.zohopackage;
import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int sum = 0,n;
		int a = 0;
		int b = 1;
		sum = a + b;
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		scn.close();
		while(n>0)
		{
			System.out.print(a + " ");
			a = b; 
			b = sum;
			sum = a + b;
			n--;
		}
	}
}
