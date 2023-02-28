package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JunitAnnotationDemo {

	@Test
	@DisplayName("SimpleJunitTestingMethod")
	void test() 
	{
    System.out.println("First Junit Test Case");
    }
	@Test
	@BeforeAll
	/*If we make this method as static then we will not get
	* method name in testing
	*to overcome this we must have to use "testInstance
	*/
	 static void display()
	{
		System.out.println("Welcome to Junit5 Testing");
	}
	@Test
	@AfterEach
	@Disabled
     void accept()
    {
    	System.out.println("After Each Method");
    }
	@Test
	@AfterAll
	static void print()
	{
	System.out.println("All Test Cases");	
	}
}
