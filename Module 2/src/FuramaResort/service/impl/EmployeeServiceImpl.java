package FuramaResort.service.impl;

import FuramaResort.model.person.Employee;
import FuramaResort.repository.impl.EmployeeRepositoryImpl;
import FuramaResort.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final EmployeeRepositoryImpl employeeRepository= new EmployeeRepositoryImpl();

    @Override
    public Employee editEmployee(String id, Employee employee) {
       return employeeRepository.editEmployee(id, employee);
    }

    @Override
    public Employee deleteEmployee(String id) {
     return employeeRepository.deleteEmployee(id);
    }

    @Override
    public Employee searchEmployee(String name) {
        return employeeRepository.searchEmployee(name);
    }

    @Override
    public Employee searchEmployeeById(String id) {
        return employeeRepository.searchEmployeeById(id);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public List getList() {
        return employeeRepository.getList();
    }
}
