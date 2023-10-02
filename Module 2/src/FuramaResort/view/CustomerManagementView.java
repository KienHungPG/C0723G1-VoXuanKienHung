package FuramaResort.view;

import FuramaResort.model.person.Customer;
import FuramaResort.utils.Regex;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementView {

    Scanner scanner = new Scanner(System.in);
    public void displayCustomerMenu(){
        System.out.println("-----CUSTOMER MENU-----");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }
    public void displayCustomer(List<Customer> customerList) {
        if (customerList.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (Customer customer : customerList) {
                System.out.println("List of employees: " + customer);
            }
        }
    }

    public Customer inputCustomer() {
        List<Customer> customerList = new ArrayList<>();
        String customerCode;
        String customerName;
        String dateOfBirth = null;
        String address;
        String customerType;
        String numberIdCard;
        String numberPhone;
        String gender;
        String email;
        boolean check;
        do {
            System.out.println("Enter the customer code as KH-YYYY: ");
            customerCode = scanner.nextLine();
            if (!Regex.customerCodeValidate(customerCode)) {
                System.out.println("Invalid customer code, please re-enter");
            }
        } while (!Regex.customerCodeValidate(customerCode));
        do {
            System.out.println("Enter the customer's name: ");
            customerName = scanner.nextLine();
            if (!Regex.nameValidate(customerName)) {
                System.out.println("Invalid customer name, please re-enter");
            }
        } while (!Regex.nameValidate(customerName));
        do {
            check = false;
            try {
                System.out.println("Enter the customer's date of birth(dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                if (Regex.ageValidate(dateOfBirth)) {
                    check = true;
                } else {
                    System.out.println("The customer's age invalid!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("The customer's date of birth is invalid, please re-enter");
            }
        } while (!check);
            System.out.println("Enter the customer's address: ");
            address = scanner.nextLine();
        do {
            System.out.println("Enter the customer's gender (Male|Female|Other): ");
            gender = scanner.nextLine();
            if (!Regex.genderValidate(gender)) {
                System.out.println("Invalid gender, please re-enter");
            }
        } while (!Regex.genderValidate(gender));
        do {
            System.out.println("Enter the customer's email: ");
            email = scanner.nextLine();
            if (!Regex.emailValidate(email)) {
                System.out.println("Invalid email, please re-enter");
            }
        } while (!Regex.emailValidate(email));
        do {
            System.out.println("Enter the customer's national identification number: ");
            numberIdCard = scanner.nextLine();
            if (!Regex.numberIdCardValidate(numberIdCard)) {
                System.out.println("The employee's citizen identification number is invalid, please re-enter");
            }
        } while (!Regex.numberIdCardValidate(numberIdCard));
        do {
            System.out.println("Enter the customer's phone number: ");
            numberPhone = scanner.nextLine();
            if (!Regex.numberPhoneValidate(numberPhone)) {
                System.out.println("Invalid phone number, please re-enter");
            }
        } while (!Regex.numberPhoneValidate(numberPhone));
        do {
            System.out.println("Enter the customer's type (Diamond|Platinum|Gold|Silver|Member): ");
            customerType = scanner.nextLine();
            if (!Regex.customerTypeValidate(customerType)) {
                System.out.println("The customer type is invalid, please re-enter");
            }
        } while (!Regex.customerTypeValidate(customerType));
        Customer newCustomer = new Customer(customerName, dateOfBirth, address, gender, numberIdCard, numberPhone, email, customerCode, customerType);
        return newCustomer;
    }

    public String inputCustomerCode() {
        System.out.println("Enter customer code: ");
        String customerCode = scanner.nextLine();
        return customerCode;
    }

    public Customer editCustomer(String currentCustomerCode) {
        String customerCode = currentCustomerCode;
        String customerName;
        String dateOfBirth = null;
        String address;
        String customerType;
        String numberIdCard;
        String numberPhone;
        String gender;
        String email;
        boolean check;
        do {
            System.out.println("Enter the customer's new name: ");
            customerName = scanner.nextLine();
            if (!Regex.nameValidate(customerName)) {
                System.out.println("Invalid customer name, please re-enter");
            }
        } while (!Regex.nameValidate(customerName));
        do {
            check = false;
            try {
                System.out.println("Enter the customer's new date of birth(dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                if (Regex.ageValidate(dateOfBirth)) {
                    check = true;
                } else {
                    System.out.println("The customer's age must be greater than 18!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("The customer's date of birth is invalid, please re-enter");
            }
        } while (!check);
        System.out.println("Enter the customer's new address: ");
        address = scanner.nextLine();
        do {
            System.out.println("Enter the new customer's gender (Male|Female|Other): ");
            gender = scanner.nextLine();
            if (!Regex.genderValidate(gender)) {
                System.out.println("Invalid gender, please re-enter");
            }
        } while (!Regex.genderValidate(gender));
        do {
            System.out.println("Enter the customer's new email: ");
            email = scanner.nextLine();
            if (!Regex.emailValidate(email)) {
                System.out.println("Invalid email, please re-enter");
            }
        } while (!Regex.emailValidate(email));
        do {
            System.out.println("Enter the customer's new national identification number: ");
            numberIdCard = scanner.nextLine();
            if (!Regex.numberIdCardValidate(numberIdCard)) {
                System.out.println("The employee's citizen identification number is invalid, please re-enter");
            }
        } while (!Regex.numberIdCardValidate(numberIdCard));
        do {
            System.out.println("Enter the customer's new phone number: ");
            numberPhone = scanner.nextLine();
            if (!Regex.numberPhoneValidate(numberPhone)) {
                System.out.println("Invalid phone number, please re-enter");
            }
        } while (!Regex.numberPhoneValidate(numberPhone));
        do {
            System.out.println("Enter new the customer's type (Diamond|Platinum|Gold|Silver|Member): ");
            customerType = scanner.nextLine();
            if (!Regex.customerTypeValidate(customerType)) {
                System.out.println("The customer type is invalid, please re-enter");
            }
        } while (!Regex.customerTypeValidate(customerType));
        Customer newCustomer = new Customer(customerName, dateOfBirth, address, gender, numberIdCard, numberPhone, email, customerCode, customerType);
        return newCustomer;
    }

    public void searchCustomer(Customer customer) {
        String customerList = "Customer{" + "name='" + customer.getName() + '\'' +
                ", dateOfBirth=" + customer.getDateOfBirth() +
                ", address='" + customer.getAddress() + '\'' +
                ", gender='" + customer.getGender() + '\'' +
                ", numberIDCard=" + customer.getNumberIDCard() +
                ", numberPhone=" + customer.getNumberPhone() +
                ", email='" + customer.getEmail() + '\'' +
                "employeeCode='" + customer.getCustomerCode() + '\'' +
                "employeeType='" + customer.getCustomerType() + '\'' +
                '}';
    }
    public String inputNameSearch(){
        System.out.println("Enter the name you want to search: ");
        String name = scanner.nextLine();
        return name;
    }

}
