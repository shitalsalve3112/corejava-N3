package org.tnif.threadlifecycle;

public class ThreadLifeCycleDemo 
{
	public static void main(String[]args)
	{
		Tech t=new Tech();
		  Softskill s=new Softskill();
		  t.start();
		  //Move control to another Thread
		  t.yield();
		  s.start();
  
    }
}