package org.tnsif.decesionmaking;

	import java.util.Scanner;

	public class IfDemo {

		public static void main(String[] args) {
			try (Scanner s = new Scanner(System.in)) {
				int a=s.nextInt();
				int b=s.nextInt();
				//example on if statement
				if(a==b)
					System.out.println("a is equal to b");
			}
			System.out.println("a is not equal to b");

		}

	}
