package FuramaResort.controller;

import FuramaResort.model.person.Employee;
import FuramaResort.service.impl.EmployeeServiceImpl;
import FuramaResort.view.EmployeeManagementView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeManagementView employeeManagementView = new EmployeeManagementView();
    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    int choiceEmployee;
    Scanner scanner = new Scanner(System.in);


    public void runEmployee() {
        do {
            employeeManagementView.displayEmployeeMenu();
            choiceEmployee = Integer.parseInt(scanner.nextLine());
            switch (choiceEmployee) {
                case 1:
                    employeeManagementView.displayEmployee(employeeService.getList());
                    break;
                case 2:
                    employeeService.add(employeeManagementView.inputEmployee());
                    break;
                case 3:
                    String employeeCodeToEdit = employeeManagementView.inputEmployeeCode();
                    Employee existingEmployee = employeeService.searchEmployeeById(employeeCodeToEdit);
                    if (existingEmployee == null) {
                        System.out.println("Not found the employee to edit.");
                    } else {
                        System.out.println("Existing Employee Information:");
                        employeeManagementView.searchEmployee(existingEmployee);
                        Employee editedEmployee = employeeManagementView.editEmployee(existingEmployee.getEmployeeCode());
                        Employee updatedEmployee = employeeService.editEmployee(employeeCodeToEdit, editedEmployee);

                        if (updatedEmployee == null) {
                            System.out.println("Cannot edit employee information.");
                        } else {
                            System.out.println("Employee information has been successfully edited.");
                        }
                    }
                    break;
                case 4:
                    String employeeCodeToDelete = employeeManagementView.inputEmployeeCode();
                    Employee deletedEmployee = employeeService.deleteEmployee(employeeCodeToDelete);
                    if (deletedEmployee == null) {
                        System.out.println("Not found the employee to delete.");
                    } else {
                        System.out.println("Employee has been successfully deleted.");
                    }
                    break;
                case 5:
                    List<Employee> employeeToSearch = employeeService.searchEmployee(employeeManagementView.inputNameSearch());
                    if (employeeToSearch == null) {
                        System.out.println("Not found the employee.");
                    } else {
                        System.out.println(employeeToSearch);
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Feature is invalid. Please re-enter");
                    break;
            }
        } while (choiceEmployee != 6);
    }
}

