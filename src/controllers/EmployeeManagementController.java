package controllers;

import models.person.Employee;
import services.employeeservice.EmployeeService;

import java.util.Scanner;

public class EmployeeManagementController {
    public void employeeDisplayMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int menu;
        do {
            System.out.println("1. Display list employees: ");
            System.out.println("2. Add new employee: ");
            System.out.println("3. Delete employee: ");
            System.out.println("4. Edit employee: ");
            System.out.println("5. Return main menu: ");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    employeeService.list();
                    break;
                case 2:
                    System.out.println("Input name employee: ");
                    String nameEmployee = scanner.nextLine();
                    System.out.println("Input dateOfBirth employee: ");
                    String dateOfBirthEmployee = scanner.nextLine();
                    System.out.println("Input gender employee: ");
                    String genderEmployee = scanner.nextLine();
                    System.out.println("Input idCard employee: ");
                    String idCardEmployee = scanner.nextLine();
                    System.out.println("Input phoneNumber employee: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Input email employee: ");
                    String emailEmployee = scanner.nextLine();
                    System.out.println("Input employee code: ");
                    String employeeCode = scanner.nextLine();
                    System.out.println("Input degree employee: ");
                    String degreeEmployee = scanner.nextLine();
                    System.out.println("Input position employee: ");
                    String positionEmployee = scanner.nextLine();
                    System.out.println("Input salary employee: ");
                    String salaryEmployee = scanner.nextLine();
                    Employee employee = new Employee(nameEmployee, dateOfBirthEmployee, genderEmployee, idCardEmployee, phoneNumber, emailEmployee, employeeCode, degreeEmployee, positionEmployee, salaryEmployee);

                    employeeService.add(employee);
                    break;
                case 3:
                    System.out.println("Seach code: ");
                    String seachCodeDelete = scanner.nextLine();
                    Employee employee1 = employeeService.findCode(seachCodeDelete);
                    try {
                        if (employee1 != null) {
                            employeeService.delete(employee1);
                        } else {
                            throw new ExceptionFormat();
                        }
                    } catch (ExceptionFormat e) {
                        System.out.println("Input return: ");
                    } finally {
                        System.out.println("Finish program ");
                    }
                    break;
                case 4:
                    System.out.println("Input code employee you want edit");
                    String codeEdit = scanner.nextLine();
                    Employee employee2 = employeeService.findCode(codeEdit);
                    try {
                        if (employee2 != null) {
                            do {
                                menu = Integer.parseInt(scanner.nextLine());
                                System.out.println("Input the information you want to correct:  ");
                                System.out.println("1. Name: ");
                                System.out.println("2. Date of Birth: ");
                                System.out.println("3. Gender: ");
                                System.out.println("4. idCard: ");
                                System.out.println("5. phoneNumber: ");
                                System.out.println("6. email: ");
                                System.out.println("7. employeeCode: ");
                                System.out.println("8. Degree: ");
                                System.out.println("9. Position: ");
                                System.out.println("10. salary: ");
                                switch (menu) {
                                    case 1:
                                        System.out.println("Input new name: ");
                                        String newName = scanner.nextLine();
                                        employee2.setName(newName);
                                        break;
                                    case 2:
                                        System.out.println("Input new dateOfBirth: ");
                                        String newDateOfBirth = scanner.nextLine();
                                        employee2.setDateOfBirth(newDateOfBirth);
                                        break;
                                    case 3:
                                        System.out.println("Input new Gender: ");
                                        String newGender = scanner.nextLine();
                                        employee2.setGender(newGender);
                                        break;
                                    case 4:
                                        System.out.println("Input new idCard: ");
                                        String newIDCard = scanner.nextLine();
                                        employee2.setIdCard(newIDCard);
                                        break;
                                    case 5:
                                        System.out.println("Input new phoneNumber: ");
                                        String newPhoneNumber = scanner.nextLine();
                                        employee2.setPhoneNumber(newPhoneNumber);
                                        break;
                                    case 6:
                                        System.out.println("Input new email: ");
                                        String newEmail = scanner.nextLine();
                                        employee2.setEmail(newEmail);
                                        break;
                                    case 7:
                                        System.out.println("Input new employeeCode: ");
                                        String newEmployeeCode = scanner.nextLine();
                                        employee2.setEmployeeCode(newEmployeeCode);
                                        break;
                                    case 8:
                                        System.out.println("8. Input new Degree: ");
                                        String newDegree = scanner.nextLine();
                                        employee2.setDegree(newDegree);
                                        break;
                                    case 9:
                                        System.out.println("Input new Position: ");
                                        String newPosition = scanner.nextLine();
                                        employee2.setPosition(newPosition);
                                        break;
                                    case 10:
                                        System.out.println("Input new salary: ");
                                        String newSalary = scanner.nextLine();
                                        employee2.setSalary(newSalary);
                                        break;
                                }
                            }
                            while (true);
                        } else {
                            throw new ExceptionFormat();
                        }

                    } catch (ExceptionFormat s) {
                        System.out.println("Input return: ");
                    } finally {
                        System.out.println("Finish program ");
                    }
                    break;

                case 5:
                    return;
            }
        } while (true);
    }
}
