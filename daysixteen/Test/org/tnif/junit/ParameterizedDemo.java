package org.tnif.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// Program to Demonstrate Parametrized Test
class ParameterizedDemo {

	@ParameterizedTest
	@ValueSource(strings={"Nia","Diya"})
	void test() 
	{
		System.out.println("Hello");
	}
	
    @ParameterizedTest
    @ValueSource(strings={"Nia","Diya"})
    void dsiplay(String str)
    {
    	assertNotNull(str);
    }
}