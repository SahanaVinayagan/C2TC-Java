package com.example.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int n=5;
		int a[]=new int[n];
		System.out.println("Value of n is "+n);
		try
		{
			int x=42/n;
			a[4]=30;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cant divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Cant assign a value");
		}
		System.out.println("Outside catch block");

	}

}
