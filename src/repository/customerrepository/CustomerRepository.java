package repository.customerrepository;

import models.person.Customer;
import models.person.Employee;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
static List<Customer> customerList = new LinkedList<>();
static {
    customerList.add(new Customer("Thanh Hai","1/1/1111","nam","1","1234567890","123@gmail.com","1",""   ,"1234"));
}

    @Override
    public void list() {

    }

    @Override
    public void add(Employee employee) {

    }

    @Override
    public void edit(Employee employee) {

    }

    @Override
    public Employee findCode(String code) {
        return null;
    }
}
