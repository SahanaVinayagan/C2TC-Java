package com.example.exceptionhandling;

public class PercentageValidator {
	public static void isValidPercent(float perc) throws ArithmeticException
	{
		if(perc>=0 && perc<=100)
		{
			System.out.println("valid percentage : "+perc);
		}
		else
		{
			throw new ArithmeticException("Invalid Percentage");
		}
	}
}
