package com.jvoop;

public class TestMethOvrLdng 
{
	
	int add(int a,int b)
	{
		return(a+b);
	}
	
	long add(long a, long b)
	{
		return(a+b);
	}
	
	int add(int a,int b,int c)
	{
		return(a+b+c);
	}

	public static void main(String[] args) 
	{
		
		TestMethOvrLdng  tmo=new TestMethOvrLdng();
		
		System.out.println(tmo.add(5, 7));
		System.out.println(tmo.add(5,7,8));
		
	}

}
