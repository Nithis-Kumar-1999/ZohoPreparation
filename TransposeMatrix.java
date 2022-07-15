package com.zohopackage;
public class TransposeMatrix 
{
	public static void main(String[] args)
	{
		  int a[][]={{1,2,3},{4,5,6},{7,8,9},{1,2,3}};
	      int b[][] = new int[3][4];
	      System.out.println("Given matrix : ");
	      for(int i = 0;i < 4;i++)
	      {
	         for(int j = 0;j < 3;j++)
	         {
	            System.out.print(a[i][j]+" ");
	         }
	         System.out.println();
	      }
	      System.out.println("Matrix after transpose : ");
	      for(int i = 0;i < 3;i++)
	      {
	         for(int j = 0;j < 4;j++)
	         {
	            b[i][j] = 0;
	            for(int k = 0;k < 4;k++)
	            {
	               b[i][j]=a[j][i];
	            }
	            System.out.print(b[i][j]+" ");
	         }
	         System.out.println();
	      }
	}
}