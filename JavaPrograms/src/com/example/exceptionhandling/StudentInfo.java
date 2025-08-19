package com.example.exceptionhandling;

public class StudentInfo {
	int rollNum;
	String name;
	float percent;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPerc() {
		return percent;
	}
	public void setPerc(float percent) {
		this.percent = percent;
	}
	public void show()
	{
		try
		{
			PercentageValidator.isValidPercent(percent);
			System.out.println("Student details : ");
			System.out.println("Roll no : "+rollNum+"\tName : "+name+"\tPercentage : "+percent);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Percentage");
			System.out.println(e.getMessage());		
		}
	}
}
