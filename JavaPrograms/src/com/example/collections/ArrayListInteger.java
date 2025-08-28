package com.example.collections;
import java.util.List;
import java.util.ArrayList;
public class ArrayListInteger 
{

	public static void main(String[] args) 
	{
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("ArrayList : al");
		System.out.println(al);
		al.add(0,5);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		System.out.println(al.size());
		List<Integer> all=new ArrayList<>();
		System.out.println("ArrayList : all");
		all.addAll(al);
		all.add(40);
		all.add(50);
		System.out.println(all);
		System.out.println(all.size());
		
	}

}