package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            System.out.println("Display Main Menu:");
            System.out.println("1. Employee Management: ");
            System.out.println("2. Customer Management: ");
            System.out.println("3. Facility Management: ");
            System.out.println("4. Booking Management: ");
            System.out.println("5. Promotion Management: ");
            System.out.println("6.Exit");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    EmployeeManagementController employeeManagementController = new EmployeeManagementController();
                    employeeManagementController.employeeDisplayMenu();
                    break;
                case 2:
                    CustomerManagementController customerManagementController = new CustomerManagementController();
                    customerManagementController.customerDisplayMenu();

                    break;
                case 3:
                    System.out.println("1. Display list facility: ");
                    System.out.println("2. Add new facility: ");
                    System.out.println("3. Display list facility maintenance: ");
                    System.out.println("4. Return main menu: ");

                    break;
                case 4:
                    System.out.println("1. Add new booking: ");
                    System.out.println("2. Display list booking: ");
                    System.out.println("3. Return main menu: ");

                    break;
                case 5:
                    System.out.println("1. Display list customers use service: ");
                    System.out.println("2. Display list customers get voucher: ");
                    System.out.println("3. Return main menu: ");

                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }


    public static void main(String[] args) {
        displayMainMenu();
    }
}
