package org.tnif.staticdemo;

public class SaticMethodExecuter {

	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		s.setSalary(45000);
		System.out.println(s.getSalary());
		StaticMethod.display();
}
}