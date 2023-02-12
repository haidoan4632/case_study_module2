package services.customerservice;

import models.person.Customer;
import models.person.Employee;

public interface ICustomerService {
    void list();

    void add(Customer customer);

    void edit(Customer customer);

    Employee findCode(String code);
}
