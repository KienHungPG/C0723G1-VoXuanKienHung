package FuramaResort.service;

import FuramaResort.model.person.Employee;

public interface IEmployeeService extends IFuramaService<Employee>{
    Employee editEmployee(String id, Employee employee);
    Employee deleteEmployee(String id);
    Employee searchEmployee(String name);
    Employee searchEmployeeById(String id);
}
