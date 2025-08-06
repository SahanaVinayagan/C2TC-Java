package com.assignments.assignment1.bankingtransactionsystem;

public class Bank 
{
	private static int totalAccounts;
	Bank()
	{
		totalAccounts++;
	}
	public static int getTotalAccounts()
	{
		return totalAccounts;
	}
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		Bank b2=new Bank();
		System.out.println("Total Accounts : "+Bank.getTotalAccounts());	
	}

}
