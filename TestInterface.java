package com.jvoop;

interface api1
{
	int val=150;
	void method1();
	
}

interface api2 extends api1
{
	void method2();
}

class Task implements api1,api2
{
	int val=15;
	
	public void method2() 
	{
		System.out.println(".....METHOD--> 2.....");
	}

	public void method1() 
	{
		System.out.println(".....METHOD--> 1.....");
	}

	public void message() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class TestInterface 
{

	public static void main(String[] args) 
	{
		
		Task tk=new Task();
		
		tk.method1();
		tk.method2();
		

	}

}
