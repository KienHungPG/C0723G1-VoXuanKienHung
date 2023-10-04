package casestudy.view;

import casestudy.controller.CustomerController;
import casestudy.controller.EmployeeController;
import casestudy.model.person.Customer;
import casestudy.model.person.Employee;
import casestudy.model.person.Person;
import casestudy.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class FurumaSystem {
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);

    public void managementFurama() {
        int choiceMenu = this.choiceMenu();
        switch (choiceMenu) {
            case 1:
                managementEmployee();
                break;
            case 2:
                managementCustomer();
                break;
            case 3:
                managementFacility();
                break;
            case 4:
                displayBookingMenu();
                break;
            case 5:
                displayPromotionMenu();
                break;
            case 6:
                System.exit(1);
        }
        this.managementFurama();
    }

    private void managementEmployee() {
        int choiceMenuEmployee = choiceMenuEmployee();
        switch (choiceMenuEmployee) {
            case 1:
                System.out.println(employeeController.showEmployee());
                break;
            case 2:
                employeeController.addEmployee(addNewEmployee());
                break;
            case 3:
                Employee employee = editEmployee();
                if (employee == null) {
                    System.out.println("Not found!!!");
                } else {
                    employeeController.editEmployee(employee);
                    System.out.println("Edit successful.");
                }
                break;
            case 4:
                String employeeCodeToDelete = inputEmployeeCode();
                if (checkEmployeeCode(employeeCodeToDelete)) {
                    employeeController.deleteEmployee(employeeCodeToDelete);
                    System.out.println("Delete successful.");
                } else {
                    System.out.println("Not found!!!");
                }
                break;
            case 5:
                String name = inputNameToSearch();
                List<Employee> employees = employeeController.searchEmployee(name);
                if (employees.size() == 0){
                    System.out.println("Not found!!!");
                }else{
                    System.out.println(employees);
                }
                    break;
            case 6:
                return;
        }
        this.managementEmployee();
    }
    private void managementCustomer(){
        int choiceMenuCustomer = choiceMenuCustomer();
        switch (choiceMenuCustomer){
            case 1:
                System.out.println(customerController.showCustomer());
                break;
            case 2:
                customerController.addCustomer(addNewCustomer());
                break;
            case 3:
                Customer customer = editCustomer();
                if (customer == null) {
                    System.out.println("Not found!!!");
                } else {
                    customerController.editCustomer(customer);
                    System.out.println("Edit successful.");
                }
                break;
            case 4:
                String customerCodeToDelete = inputCustomerCode();
                if (checkCustomerCode(customerCodeToDelete)) {
                    customerController.deleteCustomer(customerCodeToDelete);
                    System.out.println("Delete successful.");
                } else {
                    System.out.println("Not found!!!");
                }
                break;
            case 5:
                String name = inputNameToSearch();
                List<Customer> customers = customerController.searchCustomer(name);
                if (customers.size() == 0){
                    System.out.println("Not found!!!");
                }else{
                    System.out.println(customers);
                }
                break;
            case 6:
                return;
        }
        this.managementCustomer();
    }
    private void managementFacility(){
        int choiceFacility = choiceMenuFacility();
        switch (choiceFacility){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                return;
        }
        this.managementFacility();
    }
    private void managementBooking(){
        int choiceFacility = choiceMenuBooking();
        switch (choiceFacility){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                return;
        }
        this.managementBooking();
    }
    private void managementPromo(){
        int choiceFacility = choiceMenuPromo();
        switch (choiceFacility){
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
        this.managementPromo();
    }

    private void displayMainMenu() {
        System.out.println("==========MENU==========");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    private void displayEmployeeMenu() {
        System.out.println("==========EMPLOYEE MENU==========");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    private void displayCustomerMenu() {
        System.out.println("==========CUSTOMER MENU==========");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
    }

    private void displayFacilityMenu() {
        System.out.println("==========FACILITY MENU==========");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }

    private void displayBookingMenu() {
        System.out.println("==========BOOKING MENU==========");
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }

    private void displayPromotionMenu() {
        System.out.println("==========PROMO MENU==========");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
    }

    private int choiceMenu() {
        int choiceOption;
        do {
            try {
                this.displayMainMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 6) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }

    private int choiceMenuEmployee() {
        int choiceOption;
        do {
            try {
                this.displayEmployeeMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 6) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }
    private int choiceMenuCustomer() {
        int choiceOption;
        do {
            try {
                this.displayCustomerMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 6) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }

    private String inputEmployeeCode() {
        String employeeCode;
        do {
            System.out.println("Enter the employee code NV-XXXX(X is integer): ");
            employeeCode = scanner.nextLine();
            if (Regex.employeeCodeValidate(employeeCode)) {
                return employeeCode;
            } else {
                System.out.println("Employee code invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private boolean checkEmployeeCode(String employeeCode) {
        for (Employee employee : employeeController.showEmployee()) {
            if (employee.getEmployeeCode().equals(employeeCode)){
                return true;
            }
        }
        return false;
    }

    private String inputName() {
        String name;
        do {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            if (Regex.nameValidate(name)) {
                return name;
            } else {
                System.out.println("Name invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private String inputDateOfBirth() {
        String dateOfBirth;
        do {
            System.out.println("Enter date of birth(dd/MM/YYYY): ");
            dateOfBirth = scanner.nextLine();
            if (Regex.ageValidate(dateOfBirth)) {
                return dateOfBirth;
            } else {
                System.out.println("Date of Birth invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private String inputGender() {
        int choiceGender;
        do {
            try {
                System.out.println("Choose gender: ");
                System.out.println("1. Male");
                System.out.println("2. Female");
                System.out.println("3. Other");
                choiceGender = Integer.parseInt(scanner.nextLine());
                if (choiceGender <= 0 || choiceGender > 3) {
                    System.out.println("Invalid. PLease re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice gender must be a number.");
            }
        } while (true);
        if (choiceGender == 1) {
            return "Male";
        } else if (choiceGender == 2) {
            return "Female";
        } else {
            return "Other";
        }
    }

    private String inputNumberIdCard() {
        String numberIdCard;
        do {
            System.out.println("Enter number ID card (9 or 12 number): ");
            numberIdCard = scanner.nextLine();
            if (Regex.numberIdCardValidate(numberIdCard)) {
                return numberIdCard;
            } else {
                System.out.println("Number ID card invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private String inputNumberPhone() {
        String numberPhone;
        do {
            System.out.println("Enter number phone (0xxxxxxxxx): ");
            numberPhone = scanner.nextLine();
            if (Regex.numberPhoneValidate(numberPhone)) {
                return numberPhone;
            } else {
                System.out.println("Number phone invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private String inputEmail() {
        String email;
        do {
            System.out.println("Enter email (abc@example.com): ");
            email = scanner.nextLine();
            if (Regex.emailValidate(email)) {
                return email;
            } else {
                System.out.println("Email invalid. Please re-enter!!!");
            }
        } while (true);
    }

    private void inputEmployee(Employee employee) {
        inputInformation(employee);
        employee.setEducationLevel(inputEducationLevel());
        employee.setJobPosition(inputJobPosition());
        employee.setSalary(inputSalary());
    }

    private void inputInformation(Person person) {
        person.setName(inputName());
        person.setDateOfBirth(inputDateOfBirth());
        person.setGender(inputGender());
        person.setNumberIDCard(inputNumberIdCard());
        person.setNumberPhone(inputNumberPhone());
        person.setEmail(inputEmail());
    }

    private String inputEducationLevel() {
        int choiceLevel;
        do {
            try {
                System.out.println("Choose education level: ");
                System.out.println("1. Intermediate");
                System.out.println("2. College");
                System.out.println("3. University");
                System.out.println("4. After University");
                choiceLevel = Integer.parseInt(scanner.nextLine());
                if (choiceLevel <= 0 || choiceLevel > 4) {
                    System.out.println("Invalid. PLease re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice level must be a number.");
            }
        } while (true);
        if (choiceLevel == 1) {
            return "Intermediate";
        } else if (choiceLevel == 2) {
            return "College";
        } else if (choiceLevel == 3) {
            return "University";
        } else {
            return "After University";
        }
    }

    private String inputJobPosition() {
        int choicePosition;
        do {
            try {
                System.out.println("Choose job position: ");
                System.out.println("1. Receptionist");
                System.out.println("2. Serviceman");
                System.out.println("3. Specialist");
                System.out.println("4. Supervisor");
                System.out.println("5. Manager");
                System.out.println("6. Director");
                choicePosition = Integer.parseInt(scanner.nextLine());
                if (choicePosition <= 0 || choicePosition > 6) {
                    System.out.println("Invalid. PLease re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice job position must be a number.");
            }
        } while (true);
        if (choicePosition == 1) {
            return "Receptionist";
        } else if (choicePosition == 2) {
            return "Serviceman";
        } else if (choicePosition == 3) {
            return "Specialist";
        } else if (choicePosition == 4) {
            return "Supervisor";
        } else if (choicePosition == 5) {
            return "Manager";
        } else {
            return "Director";
        }
    }

    private Integer inputSalary() {
        int salary;
        do {
            try {
                System.out.println("Enter salary: ");
                salary = Integer.parseInt(scanner.nextLine());
                if (salary <= 0) {
                    System.out.println("Salary > 0.Please re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Salary must be integer. Enter again!!!");
            }
        } while (true);
        return salary;
    }

    private Employee addNewEmployee() {
        Employee employee = new Employee();
        String employeeCode;
        do {
            employeeCode = inputEmployeeCode();
            if (checkEmployeeCode(employeeCode)) {
                System.out.println("Employee code already exists");
            }
        } while (checkEmployeeCode(employeeCode));
        employee.setEmployeeCode(employeeCode);
        inputEmployee(employee);
        return employee;
    }

    private Employee editEmployee() {
        String employeeCode = inputEmployeeCode();
        for (Employee employee1 : employeeController.showEmployee()) {
            if (employee1.getEmployeeCode().equals(employeeCode)) {
                inputEmployee(employee1);
                return employee1;
            }
        }
        return null;
    }

    private String inputNameToSearch() {
        String name;
        do {
            System.out.println("Enter the name you want to search: ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("")) {
                System.out.println("Can not empty. Please re-enter");
            } else {
                break;
            }
        } while (true);
        return name;
    }
    private String inputCustomerCode() {
        String employeeCode;
        do {
            System.out.println("Enter the employee code KH-XXXX(X is integer): ");
            employeeCode = scanner.nextLine();
            if (Regex.customerCodeValidate(employeeCode)) {
                return employeeCode;
            } else {
                System.out.println("Employee code invalid. Please re-enter!!!");
            }
        } while (true);
    }
    private String inputCustomerType() {
        int choiceType;
        do {
            try {
                System.out.println("Choose job position: ");
                System.out.println("1. Diamond");
                System.out.println("2. Platinum");
                System.out.println("3. Gold");
                System.out.println("4. Silver");
                System.out.println("5. Member");
                choiceType = Integer.parseInt(scanner.nextLine());
                if (choiceType <= 0 || choiceType > 5) {
                    System.out.println("Invalid. PLease re-enter!!!");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Choice customer type must be a number.");
            }
        } while (true);
        if (choiceType == 1) {
            return "Diamond";
        } else if (choiceType == 2) {
            return "Platinum";
        } else if (choiceType == 3) {
            return "Gold";
        } else if (choiceType == 4) {
            return "Silver";
        } else {
            return "Member";
        }
    }
    private String inputAddress() {
        String address;
        do {
            System.out.println("Enter the customer's address: ");
            address = scanner.nextLine();
            if (address.equalsIgnoreCase("")) {
                System.out.println("Can not empty. Please re-enter");
            } else {
                break;
            }
        } while (true);
        return address;
    }
    private void inputCustomer(Customer customer) {
        inputInformation(customer);
        customer.setCustomerType(inputCustomerType());
        customer.setAddress(inputAddress());
    }
    private boolean checkCustomerCode(String customerCode) {
        for (Customer customer : customerController.showCustomer()) {
            if (customer.getCustomerCode().equals(customerCode)) ;
            return true;
        }
        return false;
    }
    private Customer addNewCustomer() {
        Customer customer = new Customer();
        String customerCode;
        do {
            customerCode = inputCustomerCode();
            if (checkCustomerCode(customerCode)) {
                System.out.println("Customer code already exists");
            }
        } while (checkEmployeeCode(customerCode));
        customer.setCustomerCode(customerCode);
        inputCustomer(customer);
        return customer;
    }
    private Customer editCustomer() {
        String customerCode = inputCustomerCode();
        for (Customer customer : customerController.showCustomer()) {
            if (customer.getCustomerCode().equals(customerCode)) {
                inputCustomer(customer);
                return customer;
            }
        }
        return null;
    }
    private int choiceMenuFacility() {
        int choiceOption;
        do {
            try {
                this.displayFacilityMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 5) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }
    private int choiceMenuBooking() {
        int choiceOption;
        do {
            try {
                this.displayBookingMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 6) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }
    private int choiceMenuPromo() {
        int choiceOption;
        do {
            try {
                this.displayPromotionMenu();
                System.out.println("Choose feature in Menu:");
                choiceOption = Integer.parseInt(scanner.nextLine());
                if (choiceOption <= 0 || choiceOption > 3) {
                    System.out.println("Feature invalid. Please re-enter!!!!");
                } else {
                    return choiceOption;
                }
            } catch (NumberFormatException e) {
                System.out.println("Feature must be a number!!!!");
            }
        } while (true);
    }
}
