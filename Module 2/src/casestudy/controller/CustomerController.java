package casestudy.controller;

import casestudy.model.person.Customer;
import casestudy.service.IPersonService;
import casestudy.service.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {
    private final IPersonService<Customer> personService = new CustomerServiceImpl();
    public List<Customer> showCustomer(){
        return personService.displayList();
    }
    public void addCustomer(Customer customer){
        personService.add(customer);
    }
    public void editCustomer(Customer customer){
        personService.edit(customer);
    }
    public void deleteCustomer(String id){
        personService.delete(id);
    }
    public List<Customer> searchCustomer(String name){
        return personService.search(name);
    }
}
