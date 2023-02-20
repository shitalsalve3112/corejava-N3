package org.tnif.thiskeyword;

class PM
{
	void display(PM obj)
	{
		System.out.println("Human Resourse");
	}
	void accept() {
		display(this);
	}
}

public class ThisKeywordRunner{
	public static void main(String[]args) {
	PM obj=new PM();
	obj.accept();
	}
}
