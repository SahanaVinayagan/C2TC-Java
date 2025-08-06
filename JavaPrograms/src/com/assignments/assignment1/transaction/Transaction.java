package com.assignments.assignment1.transaction;

public class Transaction {

    private final double transactionFee;

    public Transaction(double fee) {
        this.transactionFee = fee;
    }

    public final void performTransaction(double amount, double accountBalance) {
        if (amount + transactionFee <= accountBalance) {
            double updatedBalance = accountBalance - amount - transactionFee;
            System.out.println("Transaction successful!");
            System.out.println("Amount Debited: ₹" + amount);
            System.out.println("Transaction Fee: ₹" + transactionFee);
            System.out.println("Remaining Balance: ₹" + updatedBalance);
        } else {
            System.out.println("Transaction failed: Insufficient balance.");
        }
    }

    public double getTransactionFee() {
        return transactionFee;
    }
}
