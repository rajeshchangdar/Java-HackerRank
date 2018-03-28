package com.start;

public class LupBrkCntnChk 
{

	public static void main(String[] args) 
	{
		
		int i,j;
		
		int arr[]={2,4,6,8,10};
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(arr[j]==6)
				{
					System.out.println("Breaking from J loop ");
					break;
				}
				System.out.println(arr[j]);
			}
			
		}

	}

}
