package com.assignments.assignment3.testscoretracker;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    ArrayList<Integer> scores = new ArrayList<>();
		    for (int i = 0; i < n; i++) {
		    	scores.add(sc.nextInt());
		    }
		    System.out.println("Test Scores:");
		    for (int score : scores) {
		    	System.out.print(score + " ");
		    }
		    sc.close();
	}
}
