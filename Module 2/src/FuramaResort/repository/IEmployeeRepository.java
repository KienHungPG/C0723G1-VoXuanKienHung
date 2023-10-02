package FuramaResort.repository;

import FuramaResort.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IFuramaRepository<Employee>{
    Employee editEmployee(String id, Employee employee);
    Employee deleteEmployee(String id);
    List<Employee> searchEmployee(String name);
    Employee searchEmployeeById(String id);
}
