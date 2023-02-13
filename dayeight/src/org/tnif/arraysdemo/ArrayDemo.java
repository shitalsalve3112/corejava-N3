package org.tnif.arraysdemo;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo 
{

	public static void main (String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements" 
		+"in the array");	
	    int n=s.nextInt();
	    //
	    int arr[]=new int[n];
	    //
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}
System.out.println("Array Elements are:");
//
Arrays.sort(arr);

//for(int i=0; i<n; i++)
//{
//	System.out.println(arr[i]+" ");
//}
//for each without intializing and increment
	for(int i:arr) {
	System.out.print(i+" ");
	}
	
}
}