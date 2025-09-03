package com.example.generics;

import com.example.generics.Citizen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		
		Integer[] intarray = { 10, 20, 30, 40 };
		
		String[] str = { "java", "programming", "learning" };
		
		Citizen[] c= {new Citizen("Arjun","Bangalore",1462269847,364861386L),new Citizen("Arjun","Bangalore",1462269847,364861386L)};

		//Display Integer Array 
				obj.displayArrayElements(intarray);
				
				//Display String Array 
				obj.displayArrayElements(str);
				
				//Display Citizen Array 
				obj.displayArrayElements(c);
		
	}

}