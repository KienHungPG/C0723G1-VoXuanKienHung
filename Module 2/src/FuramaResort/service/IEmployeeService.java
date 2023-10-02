package FuramaResort.service;

import FuramaResort.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends IFuramaService<Employee>{
    Employee editEmployee(String id, Employee employee);
    Employee deleteEmployee(String id);
    List<Employee> searchEmployee(String name);
    Employee searchEmployeeById(String id);
}
