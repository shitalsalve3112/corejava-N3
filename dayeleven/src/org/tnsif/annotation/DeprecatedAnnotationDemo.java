package org.tnsif.annotation;

class DeprecatedDemo
{
	@Deprecated 
	//Deprecated method is used with unimportant method fields etc.
	public void display()
	{
		System.out.println("Deprecated Annotation Demo");
	}
}
public class DeprecatedAnnotationDemo {

	public static void main(String[] args) {
		DeprecatedDemo d=new DeprecatedDemo();
		d.display();

	}

}