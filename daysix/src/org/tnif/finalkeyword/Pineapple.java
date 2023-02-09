package org.tnif.finalkeyword;

 public class Pineapple  extends Cake {
 private int price;
 // If any method is delcard as final in parent class and we can't override 
 void display(int a,int b)
 {
	 System.out.println();
 }
//fin
final void display(int price)
{
	System.out.println("The price is:"+price);
}
//getters and setters
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
