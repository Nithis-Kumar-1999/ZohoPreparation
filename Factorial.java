package com.zohopackage;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int i,num,fact = 1;
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		scn.close();
        for(i = 1; i<=num; i++) 
        {
           fact = fact * i;
        }
        System.out.println("Factorial of the given number is : "+fact);
	}
}