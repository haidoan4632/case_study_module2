package data;

import models.person.Employee;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteEmployee {
    public static final String EMPLOYEE_CSV = "E:\\FuramaResort\\src\\data\\employee.csv";

    public static List<Employee> readEmployeeCSV() {
        List<Employee> employeeList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(EMPLOYEE_CSV);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String nameEmployee = temp[0];
                String dateOfBirthEmployee = temp[1];
                String genderEmployee = temp[2];
                String idCardEmployee = temp[3];
                String phoneNumberEmployee = temp[4];
                String email = temp[5];
                String employeeCode = temp[6];
                String degreeEmployee = temp[7];
                String positionEmployee = temp[8];
                String salaryEmployee = temp[9];
                employee = new Employee(nameEmployee, dateOfBirthEmployee, genderEmployee, idCardEmployee, phoneNumberEmployee, email, employeeCode, degreeEmployee, positionEmployee, salaryEmployee);
                employeeList.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buff.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return employeeList;
    }

    public static void writeEmployee(List<Employee> employees) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(EMPLOYEE_CSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        for (Employee employee : employees) {
            try {
                bufferedWriter.write(employee.getName() + "," + employee.getDateOfBirth() + ","
                        + employee.getGender() + "," + employee.getIdCard() + "," + employee.getPhoneNumber()
                        + "," + employee.getEmail() + "," + employee.getDegree() + ","
                        + employee.getPosition() + "," + employee.getSalary() +"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

