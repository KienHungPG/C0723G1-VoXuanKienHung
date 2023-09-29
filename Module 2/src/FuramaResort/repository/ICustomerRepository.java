package FuramaResort.repository;

import FuramaResort.model.person.Customer;

public interface ICustomerRepository extends IFuramaRepository<Customer>{
    void editCustomer(String id, Customer customer);
    void deleteCustomer(String id);
    Customer searchCustomer(String name);
}
