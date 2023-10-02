package FuramaResort.service;

import FuramaResort.model.person.Customer;

import java.util.List;

public interface ICustomerService extends IFuramaService<Customer>{
    Customer editCustomer(String id, Customer customer);
    Customer deleteCustomer(String id);
    List<Customer> searchCustomer(String name);
    Customer searchCustomerById(String id);
}
