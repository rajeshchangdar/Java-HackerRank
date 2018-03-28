package com.start;
import java.util.*;
public class CapWord 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String wrd=sc.next();
		
		char ch=wrd.charAt(0);
		char mch=Character.toUpperCase(ch);
		String mdf=(mch+wrd.substring(1));
		
		System.out.println("The Modified Word: "+mdf);
		
		
		sc.close();
	}

}
