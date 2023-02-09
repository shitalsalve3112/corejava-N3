package org.tnif.staticdemo;

//Program to Demonstrate Static Block
public class StaticBlock {
//Non-static variable
	private static int num;
	
//Static variable
	private static String name;
	
//getters and setters
public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}

	//Static Block 
/* Static Block is used to initialised Staic variable*/
	static 
	{
		name="Shital";
	}
}
