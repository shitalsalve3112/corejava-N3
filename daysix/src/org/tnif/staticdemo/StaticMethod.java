package org.tnif.staticdemo;
//program to demonstrate on static method
public class StaticMethod {
	
//data memebers
	private static int Salary=45000;
	
//Static variable
	 public static void display()
	
	 {
		 System.out.println("Salary is:"+Salary);
	 }
//getters and setters
	public double getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	 
}
