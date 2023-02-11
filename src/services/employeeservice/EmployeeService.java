package services.employeeservice;

import models.person.Employee;
import repository.employeerepository.EmployeeRepository;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void list() {
        employeeRepository.list();
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public Employee findCode(String code) {
        employeeRepository.findCode(code);
        return null;
    }

    @Override
    public void edit(Employee employee) {
        employeeRepository.edit(employee);
    }
}
