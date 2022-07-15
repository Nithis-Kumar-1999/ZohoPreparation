package com.zohopackage;
import java.util.Scanner;
public class ZohoOccurrence 
{
	public static void main(String[] args) 
	{
		 System.out.println("Enter a Number of Elements");
		 Scanner scn = new Scanner(System.in);
		 int num = scn.nextInt();
		 int arr[] = new int[num];
		 System.out.println("Enter the elements of the array:");  
		 for(int i=0; i<num; i++)  
		 {    
			 arr[i]=scn.nextInt();  
		 }  
		 scn.close();
		 int count = 1;
         for(int i = 0;i < arr.length;i++)
         {
        	 if(arr[i]!='0'&&arr[i]!=' '&&i==0)
        	 {
        		 count = 1;
        		 for(int j = i+1;j < arr.length;j++)
        		 {
        			 if(arr[i]==arr[j])
        			 {
        				 count++;
        				 arr[j]='0';
        				 arr[i]=arr[i];
        			 }
        		 }
        		 System.out.print(arr[i]+"("+count+")");
        		 continue;
        	 }
        	 if(arr[i]!='0'&&arr[i]!=' ')
        	 {
        		 count = 1;
        		 for(int j = i+1;j < arr.length;j++)
        		 {
        			 if(arr[i]==arr[j])
        			 {
        				 count++;
        				 arr[j]='0';
        				 arr[i]=arr[i];
        			 }
        		 }
        		 System.out.print(","+arr[i]+"("+count+")");
        	 }
         }
	}
}
