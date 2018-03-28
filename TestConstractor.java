package com.jvoop;

class Rectangle // This is to check the constructor overloading 
{
	String rectName;
	int rectLen;
	int rectWdt;
	int rectHgt;
	int area;
	int volume;
	Rectangle(int rectLen,int rectWdt)
	{
		area=(rectLen*rectWdt);
	}
	Rectangle(int rectLen,int rectWdt,int rectHgt)
	{
		volume=(rectLen*rectWdt*rectHgt);
	}
	
}

class Triangle //Testing the similarities of Copy constructor in JAVA
{
	int triLen;
	int triWdt;
	int area;
	Triangle(int triLen,int triWdt)
	{
		area=(triLen*triWdt);
	}
	
	Triangle(Triangle tr)
	{
		System.out.println("Triangle Area:"+tr.area);
	}
	
}

public class TestConstractor 
{
	int val;
	String str;
	TestConstractor(int k,int p)
	{
		System.out.println(k+p);
	}
	TestConstractor() //Testing the default constractor
	{
		
	}

	public static void main(String[] args) 
	{
		TestConstractor tc1=new TestConstractor();
		
		System.out.println(tc1.val);
		System.out.println(tc1.str);
		new TestConstractor(5,7);
		Rectangle r1=new Rectangle(5,6);
		Rectangle r2=new Rectangle(5,6,8);
		System.out.println("Area: "+r1.area);
		System.out.println("Volume: "+r2.volume);
		
		

	}

}
