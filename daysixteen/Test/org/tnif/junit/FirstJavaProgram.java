package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

//Program to Demonstrate on first junit5 testing
class FirstJavaProgram {

	//@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() 
	{
    System.out.println("First Junit Test Case");
    }
	//@test
	void display()
	{
		System.out.println("Welcome to Junit5 Testing");
	}
}