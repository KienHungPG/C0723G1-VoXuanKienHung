package FuramaResort.controller;

import FuramaResort.model.person.Customer;
import FuramaResort.model.person.Employee;
import FuramaResort.service.impl.CustomerServiceImpl;
import FuramaResort.view.CustomerManagementView;

import java.util.Scanner;

public class CustomerController {
    private final CustomerManagementView customerManagementView = new CustomerManagementView();
    private final CustomerServiceImpl customerService = new CustomerServiceImpl();
    int choiceCustomer;
    Scanner scanner = new Scanner(System.in);

    public void runCustomer() {
        do {
            customerManagementView.displayCustomerMenu();
            choiceCustomer = Integer.parseInt(scanner.nextLine());
            switch (choiceCustomer){
                case 1:
                    customerManagementView.displayCustomer(customerService.getList());
                    break;
                case 2:
                    customerService.add(customerManagementView.inputCustomer());
                    break;
                case 3:
                    String customerCodeToEdit = customerManagementView.inputCustomerCode();
                    Customer existingCustomer = customerService.searchCustomerById(customerCodeToEdit);
                    if (existingCustomer == null) {
                        System.out.println("Not found the customer to edit.");
                    } else {
                        System.out.println("Existing Customer Information:");
                        customerManagementView.searchCustomer(existingCustomer);
                        Customer editedCustomer = customerManagementView.editCustomer(existingCustomer.getCustomerCode());
                        Customer updatedCustomer = customerService.editCustomer(customerCodeToEdit, editedCustomer);

                        if (updatedCustomer == null) {
                            System.out.println("Cannot edit customer information.");
                        } else {
                            System.out.println("Customer information has been successfully edited.");
                        }
                    }
                    break;
                case 4:
                    String customerCodeToDelete = customerManagementView.inputCustomerCode();
                    Customer deletedCustomer = customerService.deleteCustomer(customerCodeToDelete);
                    if (deletedCustomer == null) {
                        System.out.println("Not found the customer to delete.");
                    } else {
                        System.out.println("Customer has been successfully deleted.");
                    }
                    break;
                case 5:
                    Customer customerToSearch = customerService.searchCustomer(customerManagementView.inputNameSearch());
                    if (customerToSearch == null) {
                        System.out.println("Not found the customer.");
                    } else {
                        customerManagementView.searchCustomer(customerToSearch);
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Feature is invalid. Please re-enter");
                    break;
            }
        } while (choiceCustomer != 6);
    }
}
