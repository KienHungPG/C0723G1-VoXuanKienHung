package FuramaResort.service.impl;

import FuramaResort.model.person.Customer;

import FuramaResort.repository.impl.CustomerRepositoryImpl;
import FuramaResort.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final CustomerRepositoryImpl customerRepository= new CustomerRepositoryImpl();
    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public List getList() {
        return customerRepository.getList();
    }

    @Override
    public Customer editCustomer(String id, Customer customer) {
        return customerRepository.editCustomer(id, customer);
    }

    @Override
    public Customer deleteCustomer(String id) {
        return customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer searchCustomer(String name) {
        return customerRepository.searchCustomer(name);
    }

    @Override
    public Customer searchCustomerById(String id) {
        return customerRepository.searchCustomerById(id);
    }
}
