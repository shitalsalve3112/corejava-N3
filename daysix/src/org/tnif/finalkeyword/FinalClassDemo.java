package org.tnif.finalkeyword;

public class FinalClassDemo {

	public static void main(String[]args)
	{
		Currency c=new Currency();
		c.setType("Dollar");
		c.print();
		
		Dollar d=new Dollar();
		d.print();
	}
}
