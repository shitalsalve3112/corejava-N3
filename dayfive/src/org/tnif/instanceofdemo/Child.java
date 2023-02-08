package org.tnif.instanceofdemo;

//demonstrate example on instance operator
//child class
public class Child  extends Person {

	private int age;
	
//Getters and setters
   public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
//default

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String name, String address,int age) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
//parameterised

	public Child(int age) {
		super();
		this.age = age;
	}
//two string

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
}
