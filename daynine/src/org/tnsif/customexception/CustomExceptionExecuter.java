package org.tnsif.customexception;
import java.util.Scanner;
//program to demonstrate on custom exception
//Driver class
public class CustomExceptionExecuter {

	public static void main (String[]args) {
		
    Scanner s=new Scanner(System.in);
    String id=s.nextLine();
    String password=s.nextLine();
    try
    {
    	if(id.equals("Salveshital8017@gmail.com") &&
    			password.equals("abc@1234"))
    	System.out.println("Credentialmatch");
    	else
          throw new LogicalCredential("Invalid credential");
    	
    }
    catch(LogicalCredential e)
    {
    	System.out.println("Exception Handlesd" +e);
    }
    finally
    {
    	System.out.println("Finally Block");
    }
    	
    }
  }