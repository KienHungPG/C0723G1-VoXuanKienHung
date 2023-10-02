package FuramaResort.repository;

import FuramaResort.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IFuramaRepository<Customer>{
    Customer editCustomer(String id, Customer customer);
    Customer deleteCustomer(String id);
    List<Customer> searchCustomer(String name);
    Customer searchCustomerById(String id);
}
