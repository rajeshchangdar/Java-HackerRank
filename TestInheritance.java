package com.jvoop;

class Parent
{
	int height=100;
	
	void display()
	{
		System.out.println("from Parent......");
	}
}

class Child1 extends Parent
{
	int weight=200;
	void display()
	{
		System.out.println("from Child1......");
	}
	
}

class Child2 extends Child1
{
	int weight=500;
	void display()
	{
		System.out.println("from Child2......");
	}
	
}
public class TestInheritance 
{

	public static void main(String[] args) 
	{
		Child2 ch2=new Child2();
		
		System.out.println(ch2.height);
		System.out.println(ch2.weight);
		ch2.display();
		

	}

}
