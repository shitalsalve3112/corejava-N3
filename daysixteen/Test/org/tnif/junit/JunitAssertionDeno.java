package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitAssertionDeno {

	@Test
	void test() 
	{
	   //fails when expected does not equal actual
		assertEquals(12,12);
	}
	
	@Test
	void display()
	{
		//Fails when Expression is true
		assertFalse(12==1);
	}
}