package com.jvoop;

class Apple
{
	int nonstat=100;
	int statVal=200;
	static int k=191;
	
	static void fun(String str)
	{
		System.out.println("The Apple is from: "+str);
	}
}

public class TestStatic
{
	static
	{
		System.out.println("This is the static block...always run first...rather than others..");
	}

	public static void main(String[] args)
	{
		
		System.out.println("This is NOT static block...main method");
		
		Apple.fun("Nagpur");//without creating object of class, static variables can be accessed..
		System.out.println(Apple.k=90);
	}
	
}
