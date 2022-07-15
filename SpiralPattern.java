package com.zohopackage;

public class SpiralPattern 
{
	public static void main(String[] args) 
	{
		int arr[][] = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		int RowStart = 0,RowEnd = arr.length,ColStart = 0,ColEnd = arr.length;
		while(RowStart<RowEnd&&ColStart<ColEnd)
		{ 
			for(int i = ColStart; i < ColEnd;i++)
			{
				System.out.print(arr[RowStart][i]+" ");
			}
			RowStart+=1;
			for(int i = RowStart;i < RowEnd;i++)
			{
				System.out.print(arr[i][ColEnd-1]+" ");
		    }
			ColEnd-=1;
			for(int i = ColEnd-1;i >= ColStart;i--)
			{
				System.out.print(arr[RowEnd-1][i]+" ");
			}
			 RowEnd-=1;
	         for(int i = RowEnd - 1;i >= RowStart;i--)
	         System.out.print(arr[i][ColStart]+ " "); 
	         ColStart+=1;		
		}	
	}
}

