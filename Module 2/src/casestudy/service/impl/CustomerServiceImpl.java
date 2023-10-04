package casestudy.service.impl;

import casestudy.model.person.Customer;
import casestudy.repository.IPersonRepository;
import casestudy.repository.impl.CustomerRepositoryImpl;
import casestudy.service.IPersonService;

import java.util.List;

public class CustomerServiceImpl implements IPersonService<Customer> {
    private final IPersonRepository<Customer> personRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> displayList() {
        return personRepository.displayList();
    }

    @Override
    public void add(Customer customer) {
        personRepository.add(customer);
    }

    @Override
    public void edit(Customer customer) {
        personRepository.edit(customer);
    }

    @Override
    public void delete(String id) {
        personRepository.delete(id);
    }

    @Override
    public List<Customer> search(String name) {
        return personRepository.search(name);
    }
}
