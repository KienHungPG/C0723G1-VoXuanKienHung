package FuramaResort.repository.impl;

import FuramaResort.model.person.Customer;
import FuramaResort.repository.ICustomerRepository;
import FuramaResort.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private final String PATH = "E:\\CG\\Module 2\\src\\FuramaResort\\data\\customer.csv";
    private final String COMMA = ",";

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = convertToCustomer(FileUtils.readFile(PATH));
        int index;
        for (Customer value : customerList) {
            if (value.getCustomerCode().equals(id)) {
                index = customerList.indexOf(value);
                customerList.set(index, customer);
            }
            FileUtils.writeFile(PATH, convertToString(customerList));
        }
    }

    @Override
    public void deleteCustomer(String id) {
        List<Customer> customerList = convertToCustomer(FileUtils.readFile(PATH));
        int index;
        for (Customer value: customerList) {
            if (value.getCustomerCode().equals(id)){
                index = customerList.indexOf(value);
                customerList.remove(index);
                break;
            }
            FileUtils.writeFile(PATH,convertToString(customerList));
        }
    }

    @Override
    public Customer searchCustomer(String name) {
        List<Customer> customers = convertToCustomer(FileUtils.readFile(PATH));
        for (Customer valueSearch : customers) {
            if (valueSearch.getName().equals(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH,convertToString(customers));
        return null;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = convertToCustomer(FileUtils.readFile(PATH));
        customerList.add(customer);
        FileUtils.writeFile(PATH,convertToString(customerList));
    }

    @Override
    public List<Customer> getList() {
        return convertToCustomer(FileUtils.readFile(PATH));
    }

    public List<String> convertToString(List<Customer> customerList) {
        List<String> strings = new ArrayList<>();
        for (Customer customer : customerList) {
            strings.add(customer.getName() + COMMA +
                    customer.getDateOfBirth() + COMMA +
                    customer.getAddress() + COMMA +
                    customer.getGender() + COMMA +
                    customer.getNumberIDCard() + COMMA +
                    customer.getNumberPhone() + COMMA +
                    customer.getEmail() + COMMA +
                    customer.getCustomerCode() + COMMA +
                    customer.getCustomerType());
        }
        return strings;
    }

    public List<Customer> convertToCustomer(List<String> strings) {
        List<Customer> customers = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            customers.add(new Customer(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]));
        }

        return customers;
    }
}
