package org.tnif.multithread;

//driver class
//program to demonstrate on synchronized method
 public class SynchonizationDemoExecuter {

	public static void main(String[] args) {
		SynchonizationDemo obj=new SynchonizationDemo();
		ThreadOne t1=new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj);
		t1.start();
		t2.start();
	}

}
