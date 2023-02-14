package org.tnif.exceptionhandlingdemo;

//program to demonstrate on Array Index Bound Exception

 public class ArrayIndexException{
	
	public static void main(String[]args) {
	 String x=null;
	 System.out.println("First line");
	 System.out.println("Second line");
	 try
	 {
		 int[] MyIntArray = new int[] {1,2,3};
		 print(MyIntArray);
	 }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("the Array doesn't have the fourth element!");
	  }
	  System.out.println("Third Line");
	 }
	 public static void print(int[]arr) {
		 System.out.println(arr[3]);
	 }
	
}