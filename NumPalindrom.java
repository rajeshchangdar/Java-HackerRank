package com.start;

import java.util.Scanner;

public class NumPalindrom 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num,val,chk=0,rem;
		System.out.println("Enter a Number: ");
		num=sc.nextInt();
		val=num;
		while(num>0)
		{
			rem=(num%10);
			
			chk=(chk*10)+rem;
			num=num/10;
		}
		
		if(chk==val)
		{
			System.out.println("palindrom number".toUpperCase());
		}
		else
		{
			System.out.println("Not a palindrom number".toUpperCase());
		}
		
		sc.close();
	}

}
