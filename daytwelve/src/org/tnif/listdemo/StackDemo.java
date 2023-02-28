package org.tnif.listdemo;
import java.util.Stack;

public class StackDemo {

	public static void main(String[]args) {
	Stack<String>obj=new Stack<>();
	obj.push("Neha");
	obj.push("Sampada");
	obj.push("Shital");
	obj.push("Sakshi");
	System.out.println("The elements inside the stack"
			      + "are: "+obj);
	obj.pop();
	System.out.println("The elements inside Stack After pop: "+obj);
	}
}
