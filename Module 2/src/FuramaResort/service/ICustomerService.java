package FuramaResort.service;

import FuramaResort.model.person.Customer;

public interface ICustomerService extends IFuramaService<Customer>{
    Customer editCustomer(String id, Customer customer);
    Customer deleteCustomer(String id);
    Customer searchCustomer(String name);
    Customer searchCustomerById(String id);
}
