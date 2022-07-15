package com.zohopackage;
import java.util.Scanner;

public class FIbonacciSeriesNth 
{
	public static int fib(int n)
    {
        if (n <= 1) 
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println("nth fibonaaci series is :" + fib(n));
    }
}