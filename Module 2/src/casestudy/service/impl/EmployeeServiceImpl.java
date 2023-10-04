package casestudy.service.impl;

import casestudy.model.person.Employee;
import casestudy.repository.IPersonRepository;
import casestudy.repository.impl.EmployeeRepositoryImpl;
import casestudy.service.IPersonService;

import java.util.List;

public class EmployeeServiceImpl implements IPersonService<Employee> {
    private final IPersonRepository<Employee> personRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> displayList() {
        return personRepository.displayList();
    }

    @Override
    public void add(Employee employee) {
        personRepository.add(employee);
    }

    @Override
    public void edit(Employee employee) {
        personRepository.edit(employee);
    }

    @Override
    public void delete(String id) {
        personRepository.delete(id);
    }

    @Override
    public List<Employee> search(String name) {
        return personRepository.search(name);
    }
}
