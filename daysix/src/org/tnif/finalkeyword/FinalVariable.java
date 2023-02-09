package org.tnif.finalkeyword;

//Final Keyword :provide restriction to user
//1.If any variable is declared as final,we can't change the value.
//2.we have to intitalize the final variable value.

//program to demonstrate on final keyword withe variable
public class FinalVariable {

	//final variable
	final  static int x= 15;
	public  static void print()
	{
		/*We can't cjange the value of x here as x is final*/
		//x=17
		System.out.println("The value of x is:"+x);
	}
	public static void main(String args[])
	{
		FinalVariable.print();
	}
}
