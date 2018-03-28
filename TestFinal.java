package com.jvoop;

class Fruit
{
	final void display()
	{
		System.out.println("...This is in FINAL in Fruit class...");
	}
	
	void redisplay()
	{
		System.out.println("..This is in Fruit class..");
	}
}

class Banana extends Fruit
{
	
}

public class TestFinal 
{
	static final int data;
	
	static{data=100;}
	
	

	public static void main(String[] args) 
	{
				
		System.out.println(TestFinal.data);

	}

}
