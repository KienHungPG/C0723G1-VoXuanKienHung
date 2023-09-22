package casestudy.controller;

import casestudy.view.CustomerManagementView;

public class CustomerController {
    private final CustomerManagementView customerManagementView = new CustomerManagementView();

    public void runCustomer() {
        customerManagementView.displayCustomerMenu();
    }
}
