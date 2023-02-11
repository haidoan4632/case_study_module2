package repository.customerrepository;

import models.person.Employee;

public interface ICustomerRepository {
    void list ();
    void add(Employee employee);
    void  edit(Employee employee);
    Employee findCode(String code);
}
