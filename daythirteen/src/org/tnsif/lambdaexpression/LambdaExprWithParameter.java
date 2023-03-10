 package org.tnsif.lambdaexpression;
 
//program to demonstrate on lambda expression to implement
//driver class
 
 public class LambdaExprWithParameter {

	public static void main(String[] args) {
		//using lambda expression
		Cube c=(a)->
		{
			return a*a*a;
		};
		System.out.println("Cube of 5 "+ c.calculate(5));
		
		//using lambda expression
		IsOdd o=(a)->a%2!=0?true:false;
		System.out.println(o.checkOdd(15));
		System.out.println(o.checkOdd(16));
	}

}