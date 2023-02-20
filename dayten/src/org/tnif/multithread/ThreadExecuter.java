package org.tnif.multithread;

//program to demonstrate on Thread class
//Driver class
public class ThreadExecuter {

	 public static void main(String[]args) {
		 //used to chanfe the thread name
		 SimpleThreadProgram p=new SimpleThreadProgram();
		 p.setName("Java Thread");
		// used to change the priority
		p.setPriority(8);
		//when therads calls to start method,it will come to ren method
		p.start();
		p.run();
		/*once we call start method again we can't restart*/
		//p.start();
		System.out.println("Current Thread" +p);
	 }
}	
		
		
			 
