package org.tnsif.annotation;

import java.util.Scanner;

public class SuppressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		// This Annotation is used to remove warnings which occurred at compile time
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);
		
	}

}