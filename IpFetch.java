package com.start;
import java.net.*;
public class IpFetch 
{

	public static void main(String[] args) throws Exception 
	{
		InetAddress IP=InetAddress.getLocalHost();
		System.out.print(IP.getHostName());
		System.out.print("-");
		System.out.print(IP.getHostAddress());		

	}

}
