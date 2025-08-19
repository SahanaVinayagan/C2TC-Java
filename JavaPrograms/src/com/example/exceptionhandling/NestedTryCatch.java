package com.example.exceptionhandling;

public class NestedTryCatch {
	public static void check()
	{
		String str="TNSIF";
		int slen=str.length();
		System.out.println("Length of the String str is "+slen);
		String str2=null;
		int y=6;
		try
		{
			try
			{
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			try
			{
				System.out.println("Length of str2 : "+str2.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
