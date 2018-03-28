package com.probsol;

import java.util.Scanner;
import java.util.Scanner;
public class Solution2 
{

	public static void main(String[] args)  
	{
		
		Scanner sc= new Scanner(System.in);

	   
	    
	    String[] input = new String[sc.nextInt()];
	    sc.nextLine();

	    for (int i = 0; i < input.length; i++) 
	    {
	        input[i] = sc.nextLine();
	    }

	    
	    for (int k=0;k<input.length;k++) 
	    {
	    	System.out.print(k+1+" ");
	        System.out.println(input[k]);
	    }
	    sc.close();
	}

}
