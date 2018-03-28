package com.probsol;

import java.util.Scanner;

public class Solution1 
{
	
	public static void calculate(long x)
	{
		long val1=(long) (-2147483648);
        long val2=(long) (2147483647);
       
        
        long val3=(long) (Math.pow(2,64));
        long val4=(long) (Math.pow(2,64)-1);
        
        
        	System.out.println(x+" can be fitted in:");
        	if(x>=-128 && x<=127)
        	{
        		System.out.println("* byte");
        	}
        	if(x>=-32768 && x<=32767)
        	{
        		System.out.println("* short");
        	}
        	if((x>=val1 && x<=val2))
        	{
        		System.out.println("* int");	                	
        	}
        	if((x>=-val3-1 && x<=val4))
        	{
        		System.out.println("* long");	                	
        	}
      
	}

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
	    int t=sc.nextInt();
	    long arr[]=new long[t];
	    String exp[] =new String[t];
	    for(int i=0;i<t;i++)
	    {
	    	try
	          {
	                long x=sc.nextLong();
	                
	                arr[i]=x;
	                exp[i]=null;
	                              
	                
	          }
	          catch(Exception e)
	          {
	              exp[i]=sc.next();
	          }

	        }
	    
	    for(int i=0;i<t;i++)
	    {
	    	 if(exp[i]!=null)
	         {
	    		 System.out.println(exp[i]+" can't be fitted anywhere.");
	    		 continue;
	         }
	  	     Solution1.calculate(arr[i]);
	    }
	    
	    sc.close();
	    }
		
	
}


