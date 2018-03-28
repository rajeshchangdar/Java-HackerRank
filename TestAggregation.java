package com.jvoop;

//-----Aggregation is used only for increasing the code re usability-------
class Operation
{
	int square(int x,int y)
	{
		return(x*y);
	}
	int volume(int x,int y,int z)
	{
		return(x*y*z);
	}
}

class Ractangle
{
	Operation op=new Operation();
	void area(int val1,int val2)
	{
		System.out.print(op.square(val1, val2));
	}
}

class Sphere
{
	Operation op=new Operation();
	
	void volume(int rad)
	{
		System.out.println(Math.PI*op.volume(rad, rad, rad)*(4/3));
	}
	
}

public class TestAggregation 
{

	public static void main(String[] args) 
	{
		Sphere sp=new Sphere();
		Ractangle rc=new Ractangle();
		sp.volume(2);
		rc.area(4, 5);

	}

}
