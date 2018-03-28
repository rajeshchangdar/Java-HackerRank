package com.start;

import java.util.Scanner;

public class DupWrdCount 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;
		System.out.println("-----------------WORD COUNT----------------------\n");
		System.out.println("Enter a string to find the duplicate words count: ");
		String str=sc.nextLine();
		
		String strArr[]=new String[100];
		
		strArr=str.split(" ");
		for(i=0;i<strArr.length;i++)
		{
			System.out.print(" # "+strArr[i]);
		}
		System.out.print("\n");
		String replace="$";
		for(i=0;i<strArr.length;i++)
		{
			count=0;
			for(j=i+1;j<strArr.length;j++)
			{
				if((strArr[i].equals(strArr[j]))&&(!(strArr[j].equals(replace))))
				{
					strArr[j]=replace;
					count+=1;
					//continue;
				}
				
				
			}
			if(!(strArr[i].equals(replace)))
			{
				System.out.println("Item: "+strArr[i]+" Count:"+(count+1));
				
			}
		}
		
		
		
		
		
		
		sc.close();
	}
	
}
