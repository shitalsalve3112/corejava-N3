package org.tnif.threadlifecycle;

//Program to demonstrate on Thread Lifecyble
public class Tech  extends Thread{

	public void run(int num)
	{
		System.out.println("Java Fullstack Traning");
		for(int i=1;i<=5;i++)
		{
		System.out.print(i+" ");	
		try
		  {
			Thread.sleep(2000);
		  }
		catch(InterruptedException e)
		  {
			System.out.println(e);
		  }
		}
		System.out.println("Technical Session");
	}
}
