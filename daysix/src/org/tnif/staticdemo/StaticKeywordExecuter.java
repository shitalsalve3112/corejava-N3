package org.tnif.staticdemo;

public class StaticKeywordExecuter {

	public static void main(String[]args) {
	   StaticVariable  s=new StaticVariable("Nia Lopez");
		System.out.println(s);

	   //use classname.varname tp prit static variable
	   System.out.println(StaticVariable.CompanyName);
	}
}
