package com.zohopackage;

public class ReverseArray 
{
	 static void reverse(int[] arr) 
	 {
        int start = 0;
        int end = arr.length - 1;
    
        while(start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
   }

   public static void main(String[] args) 
   {
           int[] arr = {1, 7, 8, 9};
           System.out.println("Before reversing an array ");
           for(int i = 0; i < arr.length; i++)
           {
               System.out.print(arr[i] + " ");
           }
           System.out.println("\nAfter reversing an array ");
           reverse(arr);
           for(int i = 0; i < arr.length; i++)
           {
               System.out.print(arr[i] + " ");
           }
    }
}
