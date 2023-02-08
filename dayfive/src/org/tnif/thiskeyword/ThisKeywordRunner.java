package org.tnif.thiskeyword;

 class mathematics{
	  int a,b;
	  mathematics()
 {
   a=10;
   b=20;
 }
	  mathematics accept()
	  {
		  
	  }
	  void dsiplay()
	  {
		  System.out.println("a is:"+a);
		  System.out.println("b is:"+b);
	  }
 }
public class ThisKeywordRunner {
	mathematics m=new mathematics();
	m.accept().display();
	
}
