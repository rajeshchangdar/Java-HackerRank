package com.start;
import java.util.*;
public class PikFstEvnNo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numList[]=new int[5];
		int i;
		System.out.println("Enter the numbers in List: ");
		for(i=0;i<5;i++)
		{
			numList[i]=sc.nextInt();
		}
		
		System.out.println("The Entered List is: ");
		for(i=0;i<5;i++)
		{
			System.out.print("->"+numList[i]);
		}
		
		
		for(i=0;i<5;i++)
		{
			if((numList[i]%2)==0)
			{
				System.out.println("\nThe First Even Number of the List: "+numList[i]);
				break;
			}
			continue;
		}
		
		sc.close();
	}

}
