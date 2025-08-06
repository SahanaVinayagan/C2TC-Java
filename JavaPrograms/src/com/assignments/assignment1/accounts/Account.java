package com.assignments.assignment1.accounts;

abstract class Account {
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract double getBalance();
	
	double balance;
	
	public Account(double bal) 
	{
        this.balance =bal;
    }

    public void printBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}
