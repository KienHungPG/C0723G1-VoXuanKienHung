package FuramaResort.repository;

import FuramaResort.model.person.Employee;

public interface IEmployeeRepository extends IFuramaRepository<Employee>{
    Employee editEmployee(String id, Employee employee);
    Employee deleteEmployee(String id);
    Employee searchEmployee(String name);
}
