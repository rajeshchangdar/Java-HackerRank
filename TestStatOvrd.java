package com.jvoop;

class Person
{
	static void display()
	{
		System.out.println("This is in static method of Person class");
	}
	
	void mult()
	{
		System.out.println("This is in Person class");
	}
	
}

class Employee extends Person
{
	static void display()
	{
		System.out.println("This is in static method of Employee class");
	}
	
	void mult()
	{
		System.out.println("This is in Employee class");
	}
}


public class TestStatOvrd 
{

	public static void main(String[] args) 
	{
		new Employee().mult();

	}

}
