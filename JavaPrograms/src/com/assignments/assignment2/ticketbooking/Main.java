package com.assignments.assignment2.ticketbooking;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details
        String bookingDetails = sc.nextLine();
        String[] details = bookingDetails.split(",");

        String stageEvent = details[0];
        String customer = details[1];
        int noOfSeats = Integer.parseInt(details[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int paymentMode = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (paymentMode) {
            case 1:
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2:
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(walletNumber, walletAmount);
                break;

            case 3:
                String cardHolder = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String creditCard = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(creditCard, ccv, cardHolder, cardAmount);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}