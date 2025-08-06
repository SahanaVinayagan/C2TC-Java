package com.assignments.assignment1.transaction;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction t = new Transaction(50.0);

        System.out.println("Performing Transaction with ₹500 from ₹1000 balance:");
        t.performTransaction(500.0, 1000.0);

        System.out.println("\nAttempting Transaction with ₹960 from ₹1000 balance:");
        t.performTransaction(960.0, 1000.0);
    }
}
