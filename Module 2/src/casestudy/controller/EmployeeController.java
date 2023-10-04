package casestudy.controller;

import casestudy.model.person.Employee;
import casestudy.service.IPersonService;
import casestudy.service.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IPersonService<Employee> personService = new EmployeeServiceImpl();
    public List<Employee> showEmployee() {
        return personService.displayList();
    }

    public void addEmployee(Employee employee) {
        personService.add(employee);
    }


    public void editEmployee(Employee employee) {
        personService.edit(employee);
    }


    public void deleteEmployee(String id) {
        personService.delete(id);
    }

    public List<Employee> searchEmployee(String name) {
        return personService.search(name);
    }
}
