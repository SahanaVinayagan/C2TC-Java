package com.example.collections;
import java.util.*;
public class Students implements Comparable{
	
	private int rollNo;
	private String name;
	private float per;
	
	public Students(int rollNo, String name,float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per=per;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	public int compareTo(Object o)
	{
		Students s2=(Students) o;
		return this.name.compareTo(s2.name);
	}
}