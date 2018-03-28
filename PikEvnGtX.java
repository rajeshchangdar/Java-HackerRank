package com.start;

import java.util.*;

public class PikEvnGtX 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int X=100;			
		while(true)
		{
			System.out.println("Enter a Even No greater than 100: ");
			int num=sc.nextInt();
			if((num%2==0)&&(num>X))
			{
				System.out.println("Thanks for entering the correct value".toUpperCase());
				break;
				
			}
			else
			{
				System.out.println("Please enter the correct number".toLowerCase());
				continue;
			}
		}
		
		sc.close();
	}

}
