package com.zohopackage;

import java.util.Scanner;

public class StringPalindrome
{
	public static void main(String args[])  
	   {  
	      String original, reverse = "";   
	      Scanner scn = new Scanner(System.in);   
	      System.out.println("Enter a string/number:");  
	      original = scn.nextLine();   
	      scn.close();
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- ) 
	      {
	         reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse))  
	      {
	         System.out.println("The given string/number is a palindrome.");  
	      }
	      else  
	         System.out.println("The given string/number isn't a palindrome.");   
	   }  
}
