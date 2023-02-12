package services.customerservice;

import models.person.Customer;
import repository.customerrepository.CustomerRepository;

public class CustomerService implements ICustomerService {
CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void list() {
        customerRepository.list();
    }

    @Override
    public void add(Customer customer) {
customerRepository.add(customer);
    }

    @Override
    public void edit(Customer customer) {
customerRepository.edit(customer);
    }

    @Override
    public Customer findCode(String code) {
        customerRepository.findCode(code);
        return null;
    }
}
