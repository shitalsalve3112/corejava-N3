package org.tnif.staticdemo;

//driver class
public class StaticBlockExecuter {
	public static void main(String [] args) {
		System.out.println(StaticBlock.getName());
		
		StaticBlock s=new StaticBlock();
		s.setNum(145);
		System.out.println(s.getNum());
	}
}
