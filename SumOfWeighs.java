package com.zohopackage;
public class SumOfWeighs 
{
	public static void main(String[] args) 
	{
		 int arr[]=new int[] {10,36,54,89,12}; 
		 int temp;
		 for(int i=0;i<arr.length;i++)
		 { 
			 for(int j=0;j<arr.length;j++)
			 { 
				 if(arr[i]<arr[j])
				 { 
					 temp=arr[i]; 
					 arr[i]=arr[j]; 
					 arr[j]=temp; 
				 }
			 }
		 }

		 int arr2[] =new int[5];
		 for(int i=0;i<5;i++)
		 { 
			 arr2[i]=0;
			 double sqr=Math.sqrt(arr[i]);
			 if((sqr*sqr)==arr[i])
			 { 
				 arr2[i]=arr2[i]+5; 
			 }

			 if(arr[i]%4==0 && arr[i]%6==0)
			 { 
				 arr2[i]=arr2[i]+4; 
			 }
			 if(arr[i]%2==0)
			 { 
				 arr2[i]=arr2[i]+3; 
			 } 
		 }
		 for(int i=0;i<arr.length;i++)
		 { 
			 System.out.print("<" +arr[i]+ "," + arr2[i]+ ">"); 
		 }
	}
}
