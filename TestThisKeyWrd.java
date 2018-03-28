package com.jvoop;

class Orange
{
	int prc;
	int wgt;
	
	Orange()
	{
		System.out.println("This is the default constructor..");
	}
	
	Orange(int wgt,int prc)
	{
		this.wgt=wgt;
		this.prc=prc;
		System.out.println("WGT: "+wgt+" and PRC:"+prc);
	}
	
	Orange(int wgt)
	{
		this();
		this.wgt=wgt;
		
		System.out.println("The Weight of the orange is..:"+wgt);
	}
	
	void display(Orange obj)
	{
		System.out.println("------------Method Invoked-------------");
	}
	
	void thisDisplay()
	{
		display(this);
	}
}


public class TestThisKeyWrd 
{

	public static void main(String[] args) 
	{
		Orange org=new Orange();
		
		org.thisDisplay();
	
	}

}
