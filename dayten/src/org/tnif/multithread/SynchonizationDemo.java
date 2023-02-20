package org.tnif.multithread;

public class SynchonizationDemo {

	 synchronized void print(int num) throws InterruptedException
	{
	for ( int i=1;i<=5;i++)
	{
		System.out.println(num*i);
	}
	}
}
class ThreadOne extends Thread
{
	SynchonizationDemo d;
	public ThreadOne(SynchonizationDemo d)
	{
		super();
		this.d=d;
	}
	 public void run()
	 try
	 {
		 d.print(10);
	 }
	 catch(InterruptedException e)
	{
		System.out.println(e);
	}
}
//
class ThreadTwo extends ThreadOne
{
	SynchonizationDemo d1;
	public ThreadTwo(SynchonizationDemo d)
	{
		super();
		this.d1=d1;
	}
	 public void run() 
	 {
		 try
		 {
			d.print(34);
		 }
	 catch(InterruptedException e)
		 {
		 System.out.println();
		 }
     }
  }
}