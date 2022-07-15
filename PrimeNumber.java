package com.zohopackage;
import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		scn.close();
		if(isPrime(number))
		{
            System.out.println(number + " is prime number");
        }
        else
        {
            System.out.println(number + " is a non-prime number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<num/2;i++)
       {
           if((num%i)==0)
           {
               return  false;
           }
       }
       return true;
	}
}