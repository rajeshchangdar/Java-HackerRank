package com.start;
import java.util.*;

public class FindFactorial 
{

	public static void main(String[] args) 
	{
		long i,fact=1,def=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find factorial value: ");
		long num=sc.nextLong();
		
		if(num==0)
		{
			System.out.println("The Factorial Value is: "+def );
		}
		else if(num<=0)
		{
			System.out.println("Factorial can't be calculated for the Negative numbers.");
		}
		else
		{
			if(num>=40)
			{
				System.out.println("--OUT OF RANGE--(It may give the wrong numbers..)");
				for(i=1;i<=num;i++)
				{
					fact=fact*i;
				}
				System.out.println("The Factorial Value is: "+fact);
			}
			else
			{
				for(i=1;i<=num;i++)
				{
					fact=fact*i;
				}
				System.out.println("The Factorial Value is: "+fact);
			}
			
		}
		
		sc.close();

	}

}
