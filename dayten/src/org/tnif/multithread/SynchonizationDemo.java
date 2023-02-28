package org.tnif.multithread;


//program to demonstrate on synchronized method

public class SynchonizationDemo {
	
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		}
	}

}
//Thread1 
class ThreadOne extends Thread
{
	SynchonizationDemo d;

	public ThreadOne(SynchonizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
//Thread2
class ThreadTwo extends Thread
{
	SynchonizationDemo d;
	
	public ThreadTwo(SynchonizationDemo d) {
		super();
		this.d = d;
	}
	public void run()
	{
		try {
			d.print(15);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
	}
}