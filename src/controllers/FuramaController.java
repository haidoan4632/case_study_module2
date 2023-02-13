package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int menu;
        do {
            System.out.println("Display Main Menu:");
            System.out.println("1. Employee Management: ");
            System.out.println("2. Customer Management: ");
            System.out.println("3. Facility Management: ");
            System.out.println("4. Booking Management: ");
            System.out.println("5. Promotion Management: ");
            System.out.println("6.Exit");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    EmployeeManagementController employeeManagementController = new EmployeeManagementController();
                    employeeManagementController.employeeDisplayMenu();
                    break;
                case 2:
                    CustomerManagementController customerManagementController = new CustomerManagementController();
                    customerManagementController.customerDisplayMenu();
                    break;
                case 3:
                 FacilityManagementController facilityManagementController = new FacilityManagementController();
                 facilityManagementController.FacilityDisplayMenu();
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
