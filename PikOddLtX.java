package com.start;

import java.util.Scanner;

public class PikOddLtX 
{
	public static void main(String[] args) 
	{
		int X=100,num;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter an Odd No less than 100: ");
			num=sc.nextInt();
			if((num<X)&&(num%2!=0))
			{
				System.out.println("Thanks for entering the correct value.".toUpperCase());
				break;
			}
			else
			{
				System.out.println("please enter the correct value".toLowerCase());
				continue;
			}
			
		}
		
		sc.close();
	}

}
