package com.probsol;

import java.util.Scanner;

public class Solution7 
{
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String str1="";
        // Complete the function
        
        int i=0,j=k;
		while(i<=s.length())
		{
			if(j==s.length()+1)
			{
				break;
			}
			
			str1=str1.concat((s.substring(i, j)+" "));
			i++;
			j++;
		}
		String arr[]=str1.split(" ");
		String tempstr;
		
		for(int b=0;b<arr.length;b++)
		{
			for(int t=b+1;t<arr.length;t++)
			{
				if(arr[b].compareTo(arr[t])>0)
				{
					tempstr=arr[b];
					arr[b]=arr[t];
					arr[t]=tempstr;
				}
			}
			
		}
        
		smallest=arr[0];
		largest=arr[arr.length-1];
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
		

	}

}
