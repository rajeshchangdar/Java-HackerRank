package com.probsol;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
		
        char charr[]=A.toCharArray();
        char arr[]=new char[charr.length];
        
        for(int i=0;i<=charr.length-1;i++)
        {
        	
        	arr[i]=charr[charr.length-i-1];
        }
        
       String str=new String(arr);
       
       
       if(A.equals(str))
       {
    	   System.out.println("Yes");
       }
       else
       {
    	   System.out.println("No");
       }
       
	}

}
