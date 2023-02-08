package org.tnif.superkeyword;

//program to demonstrate an exampe of superkeyword in terms of veriable
//parent class
public class Flower {
	
	private String name;
	
// Getters and Setters
public String getName() 
    {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
// default Constructor
  public Flower() 
    {
	  System.out.println("Flower-parent class");
		// TODO Auto-generated constructor stub
	}
  
// parameterised constructor
 public Flower(String name) 
 {
	super();
	this.name = name;
 }

}
