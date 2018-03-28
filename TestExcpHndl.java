package com.jvoop;

public class TestExcpHndl 
{

	public static void main(String[] args) 
	{
		
		int a=10,b=2,c=0;
		int arr[]=new int[5];
		try
		{
			System.out.println(a/b);
			System.out.println(a/c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			arr[6]=13;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
