package org.tnif.exceptionhandlingdemo;
import java.io.IOException;

public class Throwkeyword {
	//Method Defination
	//Throws isused to declare an exception
     public static void  donate(int age,int weight) throws Exception 
     {
    	 if(age>18 && weight>50)
    	 System.out.println("Eligible for Blood Donation");
    	 else
    		 //to throw an exception explicity
    	 throw new IOException("Not Eligible");
     }
	 public static void main(String[]args)throws Exception
	{
	try
	{
		//method call
		donate(17,55);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	}
}
