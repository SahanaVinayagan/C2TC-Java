package com.assignments.assignment1.accounts;

public class CheckingAccount extends Account{
	//double balance;
	public CheckingAccount(double bal)
	{
		super(bal);
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Balance : "+balance);
		}
		else
			System.out.println("Invalid amount");
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			balance-=amount;
			System.out.println("Balance : "+balance);
		}
		else
			System.out.println("Invalid amount");
	}
	public double getBalance()
	{
		return balance;
	}
	@Override
	public String toString() {
		return "CheckingAccount : [balance=" + balance + "]";
	}
	
}
