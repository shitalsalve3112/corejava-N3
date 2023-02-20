package org.tnif.threadlifecycle;

public class Sender {

	public void SendMessege(String message)
	{
		System.out.println("\n Sending" +message);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
	}
}
