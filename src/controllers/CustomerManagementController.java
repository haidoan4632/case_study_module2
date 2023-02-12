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
                    System.out.println("Edit customer: ");
                    System.out.println("Seach code: ");
                    String codeEdit = scanner.nextLine();
                    Customer customer1 = customerService.findCode(codeEdit);
                    try {
                        if (customer1 != null) {
                            int choice = 0;
                            do {
                                System.out.println("Input the information you want to correct:  ");
                                System.out.println("1. Name: ");
                                System.out.println("2. Date of Birth: ");
                                System.out.println("3. Gender: ");
                                System.out.println("4. idCard: ");
                                System.out.println("5. phoneNumber: ");
                                System.out.println("6. email: ");
                                System.out.println("7. customerCode: "); // Em chưa biết cần hay không?
                                System.out.println("8. customerType: ");
                                System.out.println("9. address customer: ");
                                switch (choice) {
                                    case 1:
                                        System.out.println("Input new Name: ");
                                        String newName = scanner.nextLine();
                                        customer1.setName(newName);
                                        break;
                                    case 2:
                                        System.out.println("Input new Date of Birth: ");
                                        String newDateOfBirth = scanner.nextLine();
                                        customer1.setName(newDateOfBirth);
                                        break;
                                    case 3:
                                        System.out.println("Input new Gender: ");
                                        String newGender = scanner.nextLine();
                                        customer1.setGender(newGender);
                                        break;
                                    case 4:
                                        System.out.println("Input new idCard: ");
                                        String newIdCard = scanner.nextLine();
                                        customer1.setIdCard(newIdCard);
                                        break;
                                    case 5:
                                        System.out.println("Input new phoneNumber: ");
                                        String newPhoneNumber = scanner.nextLine();
                                        customer1.setPhoneNumber(newPhoneNumber);
                                        break;
                                    case 6:
                                        System.out.println("Input new email: ");
                                        String newEmail = scanner.nextLine();
                                        customer1.setEmail(newEmail);
                                        break;
                                    case 7:
                                        System.out.println("Input new Customer Code: ");
                                        String newCustomerCode = scanner.nextLine();
                                        customer1.setCustomerCode(newCustomerCode);
                                        break;
                                    case 8:
                                        System.out.println("Input new customer Type: ");
                                        String newCustomerType = scanner.nextLine();
                                        customer1.setCustomerType(newCustomerType);
                                        break;
                                    case 9:
                                        System.out.println("Input new address Customer: ");
                                        String newAddressCustomer = scanner.nextLine();
                                        customer1.setAddress(newAddressCustomer);
                                        break;
                                }
                                while (true) ;

                            }
                            while (true);
                        } else {
                            throw new ExceptionFormat();
                        }
                    } catch (ExceptionFormat exceptionFormat) {
                        System.out.println(" Return number: ");
                    } finally {
                        System.out.println("Finish Programe");
                    }
                    break;
                case 4:
                    return;
            }
        }
        while (true);
    }
}
