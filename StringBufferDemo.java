package com.start;
public class StringBufferDemo 
{
	public static void main(String args[])
	{
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		sb1.append(" world");
		System.out.println(sb1);
		System.out.println(sb2);
		
		
		String k1="Hello";
		String k2="Hello";
		k1+=" World";
		
		System.out.println(k1);
		System.out.println(k2);
		
		
	}

}
