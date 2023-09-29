package FuramaResort.service;

import FuramaResort.model.person.Customer;

public interface ICustomerService extends IFuramaService<Customer>{
    void editCustomer(String id, Customer customer);
    void deleteCustomer(String id);
    Customer searchCustomer(String name);
}
