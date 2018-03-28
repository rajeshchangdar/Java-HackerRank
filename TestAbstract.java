package com.jvoop;

/*Here is the complete details of the Abstract class*/

abstract class Company
{
	int caompany_id;
	
	void display()
	{
		System.out.println(".....This is in the Abstract Company....");
	}
	
	abstract void displayAbs();
}

abstract class SoftCompany extends Company
{
	void display()
	{
		System.out.println("...this is under the Software Company...");
	}
	
	void displayAbs() 
	{
		System.out.println("...This is the implemented Abstract method of the abstract class in a Abstract class...");		
	}
	
	abstract void absDisplay();
}

class TCS extends SoftCompany
{

	void displayAbs() 
	{
		System.out.println("...This is the implemented Abstract method of the abstract class...");		
	}

	void absDisplay() 
	{
		System.out.println("...Display in TCS class...");		
	}
	
}


public class TestAbstract 
{

	public static void main(String[] args) 
	{
		
		Company tcs=new TCS();
		
		tcs.display();
		tcs.displayAbs();
		
		

	}

}
