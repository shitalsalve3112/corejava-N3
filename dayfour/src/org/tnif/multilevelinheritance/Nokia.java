package org.tnif.multilevelinheritance;

public class Nokia {
	//private Data members
 private int modelno;
 public void display() {
 
	 System.out.println("The Model No. is:"+modelno);
 }
 //default constructor
 public Nokia() {
	System.out.println("Nokia Class"	); 
 }
 //parameterised constructor
 public Nokia(int modelno) {
	 super();
	 this.modelno = modelno;
 }
public int getModelno() {
	return modelno;
}
public void setModelno(int modelno) {
	this.modelno = modelno;
}
 
}
