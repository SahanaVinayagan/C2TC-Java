package com.example.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("Core Java");
		pq.add("HTML");
		pq.add("CSS");
		pq.add("Python");
		
		System.out.println(pq);
		
		Queue<Integer> pq1 = new PriorityQueue<>();//elements are stored in the natural ordering, smallest number has the highest priority
		
		pq1.add(72);
		pq1.add(11);
		pq1.add(34);
		pq1.add(77);
		pq1.add(12);
		
		System.out.println(pq1);
		
		pq1.remove();
		System.out.println(pq1);
		
	}

}