package org.tnif.finalkeyword;

public class FinalMethodExecuter {

	public static void main(String[]args){
		Pineapple p=new Pineapple();
		p.flavour="mixedFruit";
		p.display();
		p.display(85,75);
		p.setPrice(270);
		p.display(p.getPrice());
		
	}
}
