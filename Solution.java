package com.probsol;

import java.util.*;
import java.io.*;

class Solution
{
	
	public void calculate(int a,int b,int n)
	{
		int i,val=a;
		int s[]=new int[n];
		for(i=0;i<n;i++)
		{
			val=(int) (val+(Math.pow(2,i)*b));
			
			s[i]=s[i]+val;
		}		
		for(i=0;i<n;i++)
		{
			System.out.print(" "+s[i]+" ");
		}
		
		System.out.print("\n");
	}
	
    public static void main(String []argh) throws IOException, NumberFormatException
    {
    	Solution sol=new Solution();
    	Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int arr[][]=new int[t][3];
        
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            arr[i][0]=a;
            arr[i][1]=b;
            arr[i][2]=n;
         }
        
        for(int i=0;i<t;i++)
        {
        	sol.calculate(arr[i][0],arr[i][1],arr[i][2]);
        }
        
        in.close();
        
   }
}
