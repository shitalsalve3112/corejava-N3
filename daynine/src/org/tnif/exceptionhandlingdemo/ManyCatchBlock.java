package org.tnif.exceptionhandlingdemo;
import java.util.Scanner;
//program to demonstrate on multiple catch block
public class ManyCatchBlock {

	public static void main(String[]args)
	{
	  int arr[]=new int[] {102,23,45};
		try
		{
		 System.out.println("C2TC");
	     //1. when it calls to system.exit()
		 //2.System.exit(0);
		 System.out.println(arr[3]);
		 
		}
		catch(Exception e)
		{
		 System.out.println("Exception handled:" +e);
		//System.exit(0);
		}
		finally
		{
			// when finally block contains exception
			int res=12/0;
			System.out.println(res);
			System.out.println("Final Block");
	}
}
}