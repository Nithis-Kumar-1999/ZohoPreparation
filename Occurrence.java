package com.zohopackage;

public class Occurrence 
{
	public static void main(String[] args) 
	{  
        String str = "java is a programming language";  
        int count = 1;
         char ch[] = str.toCharArray();
         for(int i = 0;i < str.length();i++)
         {
        	 if(ch[i]!='0'&&ch[i]!=' ')
        	 {
        		 count = 1;
        		 for(int j = i+1;j < str.length();j++)
        		 {
        			 if(ch[i]==ch[j])
        			 {
        				 count++;
        				 ch[j]='0';
        			 }
        		 }
        		 System.out.println(ch[i]+"-"+count);
        	 }
         }
    }  
}
