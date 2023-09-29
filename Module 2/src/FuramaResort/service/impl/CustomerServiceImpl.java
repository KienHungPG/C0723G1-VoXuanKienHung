package FuramaResort.service.impl;

import FuramaResort.model.person.Customer;

import FuramaResort.repository.impl.CustomerRepositoryImpl;
import FuramaResort.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final CustomerRepositoryImpl customerRepository= new CustomerRepositoryImpl();
    @Override
    public void add(Customer customer) {

    }

    @Override
    public List getList() {
        return null;
    }

    @Override
    public void editCustomer(String id, Customer customer) {

    }

    @Override
    public void deleteCustomer(String id) {

    }

    @Override
    public Customer searchCustomer(String name) {
        return null;
    }
}
