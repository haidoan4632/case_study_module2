package repository.employeerepository;

import models.person.Employee;

public interface IEmployeeRepository {
    //hiển thị danh sách nhân viên
    void list();
    // thêm mới nhân viên
    void add(Employee employee);
    //xóa theo id
    void delete (Employee employee);
    //tìm kiếm theo code;
    Employee findCode(String code);
    // chỉnh sửa thông tin nhân viên
    void edit(Employee employee);

}
