package casestudy.repository.impl;

import casestudy.model.person.Customer;
import casestudy.repository.IPersonRepository;
import casestudy.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements IPersonRepository<Customer> {
    public static final String PATH = "E:\\CG\\Module 2\\src\\casestudy\\data\\customer.csv";
    public static final String COMMA = ",";

    @Override
    public List<Customer> displayList() {
        return readCustomerFromFile();
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customers = readCustomerFromFile();
        customers.add(customer);
        writeCustomerToFile(customers);
    }

    @Override
    public void edit(Customer customer) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer1 : customers) {
            if (customer1.getCustomerCode().equals(customer.getCustomerCode())) {
                customer1.setName(customer.getName());
                customer1.setDateOfBirth(customer.getDateOfBirth());
                customer1.setGender(customer.getGender());
                customer1.setNumberIDCard(customer.getNumberIDCard());
                customer1.setNumberPhone(customer.getNumberPhone());
                customer1.setEmail(customer.getEmail());
                customer1.setCustomerType(customer.getCustomerType());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
        writeCustomerToFile(customers);
    }

    @Override
    public void delete(String id) {
        List<Customer> customers = readCustomerFromFile();
        for (Customer customer : customers) {
            if (customer.getCustomerCode().equals(id)){
                customers.remove(customer);
                break;
            }
        }
        writeCustomerToFile(customers);
    }

    @Override
    public List<Customer> search(String name) {
        List<Customer> customers = readCustomerFromFile();
        List<Customer> newCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getName().contains(name)) {
                newCustomers.add(customer);
            }
        }
        return newCustomers;
    }

    private List<Customer> readCustomerFromFile() {
        List<String> data = FileUtils.readFile(PATH);
        return convertStringToCustomer(data);
    }

    private static List<Customer> convertStringToCustomer(List<String> data) {
        List<Customer> customers = new ArrayList<>();
        for (String str : data) {
            String[] splitStr = str.split(COMMA);
            customers.add(new Customer(splitStr[0], splitStr[1], splitStr[2], splitStr[3], splitStr[4], splitStr[5],
                    splitStr[6], splitStr[7], splitStr[8]));
        }
        return customers;
    }

    private void writeCustomerToFile(List<Customer> customers) {
        List<String> data = convertCustomerToString(customers);
        FileUtils.writeFile(PATH, data);
    }

    private static List<String> convertCustomerToString(List<Customer> customers) {
        List<String> data = new ArrayList<>();
        for (Customer customer : customers) {
            data.add(customer.getName()
                    + COMMA + customer.getDateOfBirth()
                    + COMMA + customer.getGender()
                    + COMMA + customer.getNumberIDCard()
                    + COMMA + customer.getNumberPhone()
                    + COMMA + customer.getEmail()
                    + COMMA + customer.getCustomerCode()
                    + COMMA + customer.getCustomerType()
                    + COMMA + customer.getAddress());
        }
        return data;
    }
}
