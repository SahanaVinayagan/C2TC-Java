package com.example.collections;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		System.out.println(ll);
		ListIterator<Integer> i = ll.listIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
	}
}
