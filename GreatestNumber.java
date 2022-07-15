package com.zohopackage;
import java.util.Scanner;

public class GreatestNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		scn.close();
		while(num>num1) 
		{
			if(num>num2)
			{
			System.out.println("The Greatest number is:"+num);
			break;
			}
		}
		while(num1>num2)
		{
			if(num1>num)
			{
				System.out.println("The Greatest number is:"+num1);
				break;
			}
		}
		while(num2>num)
		{
			if(num2>num1)
			{
				System.out.println("The Greatest number is:"+num2);
				break;
			}
		}
	}
}
