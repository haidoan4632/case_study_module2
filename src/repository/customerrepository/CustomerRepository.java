package repository.customerrepository;

import models.person.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
static List<Customer> customerList = new LinkedList<>();
static {
    customerList.add(new Customer("Thanh Hai", "1/1/1111", "nam", "1", "1234567890", "123@gmail.com", "1", "Diamound", "1234"));
    customerList.add(new Customer("Thanh Hai2", "1/1/1112", "nu", "2", "1234567891", "1234@gmail.com", "2", "Platinium", "1235"));
    customerList.add(new Customer("Thanh Hai3", "1/1/1113", "nam", "3", "1234567892", "12345@gmail.com", "3", "Gold", "1236"));
    customerList.add(new Customer("Thanh Hai4", "1/1/1114", "nu", "4", "1234567893", "123456@gmail.com", "4", "Silver", "1237"));
    customerList.add(new Customer("Thanh Hai5", "1/1/1115", "nam", "5", "1234567895", "1234567@gmail.com", "5", "Member", "1238"));
}


    @Override
    public void list() {
        for (Customer c : customerList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customer.getCustomerCode() == customerList.get(i).getCustomerCode()) {
                customerList.set(i, customer);
            }
        }
    }


    @Override
    public Customer findCode(String code) {
        for (Customer c : customerList) {
            if (c.getCustomerCode() == code) {
                return c;
            }
        }
        return null;
    }
}
