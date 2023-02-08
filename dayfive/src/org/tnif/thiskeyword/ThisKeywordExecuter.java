package org.tnif.thiskeyword;

class HR{
 public void display(HR Obj)
{
	 System.out.println("Function1 invoke");
}	
void accept()
{
  display(this);	
}
}
public class ThisKeywordExecuter{
	public static void main(String[] args) 
	{
	HR r=new HR();
	r.accept();
	}
}