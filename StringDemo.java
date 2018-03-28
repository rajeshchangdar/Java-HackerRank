package com.start;
import java.lang.String;
public class StringDemo 
{
	public static void main(String args[])
	{
		String s1="Rajesh Changdar";
		String s2="is a good Boy.";
		String s3="Rajesh Changdar";
		
		System.out.println(s1+" "+s2);
		System.out.println((s1==s2));
		System.out.println((s1==s3));
		
		
		String k1="Hello";
		String k2="Hello";
		k1+=" World";
		
		System.out.println(k1);
		System.out.println(k2);
		
		
		String str1=new String();
		str1="Royal Challengers";
		byte[] b={2,3};
		System.out.println(str1.charAt(4));
		System.out.println(str1.toUpperCase());
		String str2=new String(b);
		System.out.println(str2.charAt(1));
		
		
		
		
	}


}
