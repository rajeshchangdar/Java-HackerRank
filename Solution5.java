package com.probsol;

import java.util.Scanner;

public class Solution5 
{
	private static boolean flag=true;
	private static int B=0;
	private static int H=0;
	
	static 
	{
			try 
			{
				Scanner sc=new Scanner(System.in);
				B=sc.nextInt();
				H=sc.nextInt();
				
				sc.close();
				
				if(H<=0||B<=0)
				{
					throw new Exception("Breadth and height must be positive");
					
				}
				
			} 
			catch (Exception e) 
			{
				System.out.println(e.toString());
				flag=false;
			}
			
			
	}

	public static void main(String[] args) 
	{
		
		if(flag)
		{
			int area=B*H;
			System.out.print(area);
		}
    }

}
