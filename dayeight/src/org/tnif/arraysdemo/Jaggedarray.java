package org.tnif.arraysdemo;
import java.util.Scanner;
 public class Jaggedarray {

	public static void main(String[]args) 
	{
		 int arr[][]=new int[3][];
		//first array as 3 column
	     arr[0]=new int[3];
	    //second array as 2 column
		arr[1]=new int[2];
		arr[2]=new int[4];
		int counter=0;
		 for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=counter++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		 System.out.println();
		
	   }
	}
 }
