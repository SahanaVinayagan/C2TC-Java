package com.assignments.assignment1.accounts;

public class AccountDemo {
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount(1000);
        System.out.println("Created Checking Account.");
        checking.deposit(500);
        checking.withdraw(200);
        checking.printBalance();
        System.out.println(checking.toString());
        
        System.out.println();

        SavingsAccount savings = new SavingsAccount(2000);
        System.out.println("Created Savings Account.");
        savings.deposit(1000);
        savings.withdraw(300);
        savings.printBalance();
        System.out.println(savings.toString());
    }
}
