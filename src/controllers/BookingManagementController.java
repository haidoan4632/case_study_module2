package controllers;

import services.bookingservice.BookingService;

import java.util.Scanner;

public class BookingManagementController {
    public void bookingDisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        int choice;
        do {
            System.out.println("1. Add new Booking: ");
            System.out.println("2. Display list booking: ");
            System.out.println("3. Return main menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("abc");
                    break;
                case 2:
                    bookingService.displayBooking();
                    System.out.println("Input ");
                    break;
                case 3:
                    break;
                default:
                    return;
            }
        }
        while (true);
    }
}
