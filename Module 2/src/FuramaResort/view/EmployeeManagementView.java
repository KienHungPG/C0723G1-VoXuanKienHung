package FuramaResort.view;

import FuramaResort.model.person.Employee;
import FuramaResort.utils.Regex;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementView {
    Scanner scanner = new Scanner(System.in);

    public void displayEmployeeMenu() {
        System.out.println("-----EMPLOYEE MENU-----");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    public void displayEmployee(List<Employee> employeeList) {
        if (employeeList.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (Employee employee : employeeList) {
                System.out.println("List of employees: " + employee);
            }
        }
    }

    public Employee inputEmployee() {
        String employeeCode;
        String employeeName;
        String dateOfBirth = null;
        String numberIdCard;
        String numberPhone;
        int salary;
        String academyLevel;
        String jobPosition;
        String gender;
        String email;
        boolean check;
        do {
            System.out.println("Enter the employee code as NV-YYYY: ");
            employeeCode = scanner.nextLine();
            if (!Regex.employeeCodeValidate(employeeCode)) {
                System.out.println("Invalid employee code, please re-enter");
            }
        } while (!Regex.employeeCodeValidate(employeeCode));
        do {
            System.out.println("Enter the employee's name: ");
            employeeName = scanner.nextLine();
            if (!Regex.nameValidate(employeeName)) {
                System.out.println("Invalid employee name, please re-enter");
            }
        } while (!Regex.nameValidate(employeeName));
        do {
            check = false;
            try {
                System.out.println("Enter the employee's date of birth(dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                if (Regex.ageValidate(dateOfBirth)) {
                    check = true;
                } else {
                    System.out.println("The employee's age must be greater than 18!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("The employee's date of birth is invalid, please re-enter");
            }
        } while (!check);
        do {
            System.out.println("Enter the employee's gender (Male|Female|Other): ");
            gender = scanner.nextLine();
            if (!Regex.genderValidate(gender)) {
                System.out.println("Invalid gender, please re-enter");
            }
        } while (!Regex.genderValidate(gender));
        do {
            System.out.println("Enter the employee's email: ");
            email = scanner.nextLine();
            if (!Regex.emailValidate(email)) {
                System.out.println("Invalid email, please re-enter");
            }
        } while (!Regex.emailValidate(email));
        do {
            System.out.println("Enter the employee's national identification number: ");
            numberIdCard = scanner.nextLine();
            if (!Regex.numberIdCardValidate(numberIdCard)) {
                System.out.println("The employee's citizen identification number is invalid, please re-enter");
            }
        } while (!Regex.numberIdCardValidate(numberIdCard));
        do {
            System.out.println("Enter the employee's phone number: ");
            numberPhone = scanner.nextLine();
            if (!Regex.numberPhoneValidate(numberPhone)) {
                System.out.println("Invalid phone number, please re-enter");
            }
        } while (!Regex.numberPhoneValidate(numberPhone));
        do {
            System.out.println("Enter the employee's salary: ");
            salary = Integer.parseInt(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Employee salary is invalid, please re-enter");
            }
        } while (salary <= 0);
        do {
            System.out.println("Enter the employee's education level (Intermediate|College|University|Postgraduate): ");
            academyLevel = scanner.nextLine();
            if (!Regex.academyLevelValidate(academyLevel)) {
                System.out.println("Employee's education level is invalid, please re-enter");
            }
        } while (!Regex.academyLevelValidate(academyLevel));
        do {
            System.out.println("Enter the employee's job position (receptionist|serviceman|specialist|supervisor|manager|director): ");
            jobPosition = scanner.nextLine();
            if (!Regex.jobPositionlValidate(jobPosition)) {
                System.out.println("The employee's job position is invalid, please re-enter");
            }
        } while (!Regex.jobPositionlValidate(jobPosition));
        Employee newEmployee = new Employee(employeeName, dateOfBirth, gender, numberIdCard, numberPhone, email, employeeCode, academyLevel, jobPosition, salary);
        return newEmployee;
    }

    public String inputEmployeeCode() {
        String employeeCode;
        do {
            System.out.println("Enter the employee code as NV-YYYY: ");
            employeeCode = scanner.nextLine();
            if (!Regex.employeeCodeValidate(employeeCode)) {
                System.out.println("Invalid employee code, please re-enter");
            }
        } while (!Regex.employeeCodeValidate(employeeCode));
        return employeeCode;
    }

    public Employee editEmployee(String currentEmployeeCode) {
        String employeeCode = currentEmployeeCode;
        String employeeName;
        String dateOfBirth = null;
        String numberIdCard;
        String numberPhone;
        int salary;
        String academyLevel;
        String jobPosition;
        String gender;
        String email;
        boolean check;
        do {
            System.out.println("Enter the new employee's name: ");
            employeeName = scanner.nextLine();
            if (!Regex.nameValidate(employeeName)) {
                System.out.println("Invalid employee name, please re-enter");
            }
        } while (!Regex.nameValidate(employeeName));

        do {
            check = false;
            try {
                System.out.println("Enter the employee's date of birth(dd/MM/yyyy): ");
                dateOfBirth = scanner.nextLine();
                if (Regex.ageValidate(dateOfBirth)) {
                    check = true;
                } else {
                    System.out.println("The employee's age must be greater than 18!");
                }
            } catch (DateTimeParseException e) {
                System.out.println("The employee's date of birth is invalid, please re-enter");
            }
        } while (!check);

        do {
            System.out.println("Enter the new employee's gender (Male|Female|Other): ");
            gender = scanner.nextLine();
            if (!Regex.genderValidate(gender)) {
                System.out.println("Invalid gender, please re-enter");
            }
        } while (!Regex.genderValidate(gender));

        do {
            System.out.println("Enter the new employee's email: ");
            email = scanner.nextLine();
            if (!Regex.emailValidate(email)) {
                System.out.println("Invalid email, please re-enter");
            }
        } while (!Regex.emailValidate(email));

        do {
            System.out.println("Enter the new employee's national identification number: ");
            numberIdCard = scanner.nextLine();
            if (!Regex.numberIdCardValidate(numberIdCard)) {
                System.out.println("The employee's citizen identification number is invalid, please re-enter");
            }
        } while (!Regex.numberIdCardValidate(numberIdCard));

        do {
            System.out.println("Enter the new employee's phone number: ");
            numberPhone = scanner.nextLine();
            if (!Regex.numberPhoneValidate(numberPhone)) {
                System.out.println("Invalid phone number, please re-enter");
            }
        } while (!Regex.numberPhoneValidate(numberPhone));

        do {
            System.out.println("Enter the new employee's salary: ");
            salary = Integer.parseInt(scanner.nextLine());
            if (salary <= 0) {
                System.out.println("Employee salary is invalid, please re-enter");
            }
        } while (salary <= 0);

        do {
            System.out.println("Enter the new employee's education level (Intermediate|College|University|Postgraduate): ");
            academyLevel = scanner.nextLine();
            if (!Regex.academyLevelValidate(academyLevel)) {
                System.out.println("Employee's education level is invalid, please re-enter");
            }
        } while (!Regex.academyLevelValidate(academyLevel));

        do {
            System.out.println("Enter the new employee's job position (receptionist|serviceman|specialist|supervisor|manager|director): ");
            jobPosition = scanner.nextLine();
            if (!Regex.jobPositionlValidate(jobPosition)) {
                System.out.println("The employee's job position is invalid, please re-enter");
            }
        } while (!Regex.jobPositionlValidate(jobPosition));

        Employee editedEmployee = new Employee(employeeName, dateOfBirth, gender, numberIdCard, numberPhone, email, employeeCode, academyLevel, jobPosition, salary);
        return editedEmployee;
    }

    public void searchEmployee(Employee employee) {
        String employeeList = "Employee{" + "name='" + employee.getName() + '\'' +
                ", dateOfBirth=" + employee.getDateOfBirth() +
                ", gender='" + employee.getGender() + '\'' +
                ", numberIDCard=" + employee.getNumberIDCard() +
                ", numberPhone=" + employee.getNumberPhone() +
                ", email='" + employee.getEmail() + '\'' +
                "employeeCode='" + employee.getEmployeeCode() + '\'' +
                ", academicLevel='" + employee.getAcademicLevel() + '\'' +
                ", jobPosition='" + employee.getJobPosition() + '\'' +
                ", Salary=" + employee.getSalary() +
                '}';
        System.out.println("Employee: " + employeeList);
    }
    public String inputNameSearch(){
        System.out.println("Enter the name you want to search: ");
        String name = scanner.nextLine();
        return name;
    }

}
