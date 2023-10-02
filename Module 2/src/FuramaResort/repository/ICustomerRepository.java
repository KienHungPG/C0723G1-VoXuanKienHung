package FuramaResort.repository;

import FuramaResort.model.person.Customer;

public interface ICustomerRepository extends IFuramaRepository<Customer>{
    Customer editCustomer(String id, Customer customer);
    Customer deleteCustomer(String id);
    Customer searchCustomer(String name);
    Customer searchCustomerById(String id);
}
