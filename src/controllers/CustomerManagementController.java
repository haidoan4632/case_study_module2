package controllers;

import models.person.Customer;
import services.customerservice.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    public void customerDisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        int menu = 0;
        do {
            System.out.println("1. Display list customers: ");
            System.out.println("2. Add new customer: ");
            System.out.println("3. Edit customer: ");
            System.out.println("4. Return main menu: ");

            switch (menu) {
                case 1:
                    customerService.list();
                    break;
                case 2:
                    System.out.println("Input name customer: ");
                    String nameCustomer = scanner.nextLine();
                    System.out.println("Input dateOfBirth customer: ");
                    String dateOfBirthCustomer = scanner.nextLine();
                    System.out.println("Input gender customer: ");
                    String genderCustomer = scanner.nextLine();
                    System.out.println("Input idCard customer: ");
                    String idCardCustomer = scanner.nextLine();
                    System.out.println("Input phoneNumber customer: ");
                    String phoneNumberCustomer = scanner.nextLine();
                    System.out.println("Input email customer: ");
                    String emailCustomer = scanner.nextLine();
                    System.out.println("Input customer code: ");
                    String customerCode = scanner.nextLine();
                    System.out.println("Input customerType: ");
                    String customerType = scanner.nextLine();
                    System.out.println("Input address customer: ");
                    String addressCustomer = scanner.nextLine();
                    Customer customer = new Customer(nameCustomer, dateOfBirthCustomer, genderCustomer, idCardCustomer, phoneNumberCustomer, emailCustomer, customerCode, customerType, addressCustomer);
                    customerService.add(customer);
                    break;
                case 3:
                case 4:
            }
        }
        while (true);


    }
}
