package repository.customerrepository;

import models.person.Customer;

public interface ICustomerRepository {
    void list();

    void add(Customer customer);

    void edit(Customer customer);

    Customer findCode(String code);
}
