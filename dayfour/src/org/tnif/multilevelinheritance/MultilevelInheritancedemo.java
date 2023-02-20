package org.tnif.multilevelinheritance;

import java.util.Scanner;

public class MultilevelInheritancedemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Model No, Verison , And Slottype");
		int modelno =s.nextInt();
		s.nextLine();
		String version=s.nextLine();
		String slottype=s.nextLine();
		Iphone i1=new Iphone(slottype);
		Iphone i11=new Iphone(modelno,"Kitkat","Singleslot");
		i1.setModelno(modelno);
		i1.setVersion(version);
		i1.getSlottype();
		i1.slot();
		i1.getVersion();
		i1.getModelno();
		i1.accept();
		i1.display();
		System.out.println(i11);
	}
}
