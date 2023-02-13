package data;

import models.person.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteCustomer {
    public static final String CUSTOMER_CSV = "E:\\FuramaResort\\src\\data\\customer.csv";

    public List<Customer> readCustomerCSV() {
        List<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buff = null;

        try {
            fileReader = new FileReader(CUSTOMER_CSV);
            buff = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Customer customer;
            while ((line = buff.readLine()) != null) {
                temp = line.split(",");
                String nameCustomer = temp[0];
                String dateOfBirthCustomer = temp[1];
                String genderCustomer = temp[2];
                String idCardCustomer = temp[3];
                String phoneNumber = temp[4];
                String email = temp[5];
                String customerCode = temp[6];
                String customerType = temp[7];
                String addressCustomer = temp[8];
                customer = new Customer(nameCustomer, dateOfBirthCustomer, genderCustomer, idCardCustomer, phoneNumber, email, customerCode, customerType, addressCustomer);
                customerList.add(customer);
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
        return customerList;
    }

    public static void WriteCustomer(List<Customer> customer) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(CUSTOMER_CSV);
        } catch (IOException e) {
            e.printStackTrace();
        }
        bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer1 : customer) {
            try {
                bufferedWriter.write(customer1.getName() + "," + customer1.getDateOfBirth() + ","
                        + customer1.getGender() + "," + customer1.getIdCard() + "," + customer1.getPhoneNumber()
                        + "," + customer1.getEmail() + "," + customer1.getCustomerCode() + ","
                        + customer1.getCustomerType() + "," + customer1.getAddress());
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
