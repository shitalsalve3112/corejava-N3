package org.tnsif.decesionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int b=s.nextInt();
			//example on if---else statement
			if(a>b)
				System.out.println("a is greater than b");
			else
				System.out.println("a is not greater than  b");
		}

	}

}