package org.tnif.staticdemo;

public class StaticBlockExecuter {

	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		
		StaticBlock s=new StaticBlock();
		s.getNum(145);
		System.out.println(StaticBlock.name);
		
	}
}
