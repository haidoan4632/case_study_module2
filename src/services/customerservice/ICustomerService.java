package services.customerservice;

import models.person.Customer;

public interface ICustomerService {
    void list();

    void add(Customer customer);

    void edit(Customer customer);

    Customer findCode(String code);
}
