package org.tnif.staticdemo;

//program to demonstrate on Static variable
public class StaticVariable {
	
//non-static variable
   private String name;
 
 //static variable
	public static String CompanyName="TCS";
	
// constructor
	public StaticVariable(String name) {
		this.name = name;
	}
//Two String
	
	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "];
	}
	
}
