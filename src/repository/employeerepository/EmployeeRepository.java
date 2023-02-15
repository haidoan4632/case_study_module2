package repository.employeerepository;

import data.ReadWriteEmployee;
import enumfile.Degree;
import models.person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    public static List<Employee> employeeList = new ArrayList<>();
    public static ReadWriteEmployee readWriteEmployee = new ReadWriteEmployee();
    static {
        employeeList.add(new Employee("Hải", "01/01/1998", "nam", "1", "0905123123", "1234@gmail.com", "1", Degree.Degree1.Master.name(), "hoc viec", "1$"));
        employeeList.add(new Employee("Quốc", "02/01/1998", "nam", "2", "0905123124", "12345@gmail.com", "2", "cap1", "boi ban", "2$"));
        employeeList.add(new Employee("Đào", "03/01/1998", "nam", "3", "0905123125", "123456@gmail.com", "3", "cap1", "dau bep", "3$"));
        employeeList.add(new Employee("Trinh", "04/01/1998", "nu", "4", "0905123126", "1234567@gmail.com", "4", "cap1", "le tan", "4$"));
        ReadWriteEmployee.writeEmployee(employeeList);
    }

    @Override
    public void list() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        ReadWriteEmployee.writeEmployee(employeeList);
    }

    @Override
    public void delete(Employee employee) {
        employeeList.remove(employee);
    }


    @Override
    public Employee findCode(String code) {
        for (Employee e : employeeList) {
            if (e.getEmployeeCode() == code) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void edit(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employee.getEmployeeCode() == employeeList.get(i).getEmployeeCode()) {
                employeeList.set(i, employee);
            }
        }
    }
}
