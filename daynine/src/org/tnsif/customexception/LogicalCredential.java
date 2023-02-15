package org.tnsif.customexception;
//program to demonstrate on custom exception

public class LogicalCredential extends Exception
   {
    //data members
	private String string;
	
	//parameterised constructor

	public LogicalCredential(String string) {
	
		this.string = string;
	}
	//two string

	@Override
	public String toString() {
		return "LogicalCredential [string=" + string + "]";
	}
	
}
