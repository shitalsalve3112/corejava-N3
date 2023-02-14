package org.tnif.exceptionhandlingdemo;
import java.util.Scanner;

//program to demonstrate to Arithematic Exception
public class ArithematicExceptionDemo {

	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains the exception code
		try 
		{
		  int res=x/y;
		  System.out.println(res);
		}
		//catch block handles the exception throw bye try block
		catch (Exception e)
		{
		  System.out.println("Exception handled using catch: "+e);	
		}
		finally
		{
		  System.out.println("Final block");
	    }
   }
}