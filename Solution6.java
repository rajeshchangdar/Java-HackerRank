package com.probsol;

import java.util.Scanner;

public class Solution6 
{

	public static void main(String[] args) 
	{
		
		String str1="";
		String str="welcometojava";
		
		int i=0,j=3;
		while(i<=str.length())
		{
			if(j==str.length()+1)
			{
				break;
			}
			
			str1=str1.concat((str.substring(i, j)+" "));
			i++;
			j++;
		}
		
		//System.out.println(str1);
		
		String arr[]=str1.split(" ");
		String tempstr;
		for(int k=0;k<arr.length;k++)
		{
			for(int t=k+1;t<arr.length;t++)
			{
				if(arr[k].compareTo(arr[t])>0)
				{
					tempstr=arr[k];
					arr[k]=arr[t];
					arr[t]=tempstr;
				}
			}
			
		}
			
		/*for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
		*/
		
		System.out.println("Largest: "+arr[0]);
		System.out.println("Smallest: "+arr[arr.length-1]);
		
		
	}
}


