package casestudy.controller;

import casestudy.view.EmployeeManagementView;

public class EmployeeController {
    private final EmployeeManagementView employeeManagementView = new EmployeeManagementView();

    public void runEmployee() {
        employeeManagementView.displayEmployeeMenu();
    }
}
