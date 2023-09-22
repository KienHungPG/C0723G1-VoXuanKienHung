package FuramaResort.controller;

import FuramaResort.view.CustomerManagementView;

public class CustomerController {
    private final CustomerManagementView customerManagementView = new CustomerManagementView();

    public void runCustomer() {
        customerManagementView.displayCustomerMenu();
    }
}
