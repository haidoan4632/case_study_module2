package services.customerservice;

import models.person.Employee;

public interface ICustomerService {
    void list ();
    void add(Employee employee);
    void  edit(Employee employee);
    Employee findCode(String code);
}
