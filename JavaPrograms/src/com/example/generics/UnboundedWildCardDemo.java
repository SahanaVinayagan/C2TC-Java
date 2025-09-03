package com.example.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		System.out.println("Display Integer values");
		//Display List of Integers
		UnboundedWildCard.display(intList);
		
		List<String> strList = Arrays.asList("Hi", "Hello", "How are you");
		System.out.println("Display String values");
		//Display List of String
		UnboundedWildCard.display(strList);


		
	}

}