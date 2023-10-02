package FuramaResort.repository.impl;

import FuramaResort.model.person.Employee;
import FuramaResort.repository.IEmployeeRepository;
import FuramaResort.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private final String PATH = "E:\\CG\\Module 2\\src\\FuramaResort\\data\\employee.csv";
    private final String COMMA = ",";


    @Override
    public Employee editEmployee(String id, Employee employee) {
        List<Employee> employeeList = convertToEmployee(FileUtils.readFile(PATH));
        int index;
        Employee temp = null;
        for (Employee value : employeeList) {
            if (value.getEmployeeCode().equals(id)) {
                index = employeeList.indexOf(value);
                temp = value;
                employeeList.set(index, employee);
            }
        }
        if (temp != null){
            FileUtils.writeFile(PATH, convertToString(employeeList));
        }
        return temp;
    }

    @Override
    public Employee deleteEmployee(String id) {
        List<Employee> employeeList = convertToEmployee(FileUtils.readFile(PATH));
        int index;
        Employee temp;
        for (Employee value : employeeList) {
            if (value.getEmployeeCode().equals(id)) {
                index = employeeList.indexOf(value);
                temp = value;
                employeeList.remove(index);
                FileUtils.writeFile(PATH, convertToString(employeeList));
                return temp;
            }
        }
        return null;
    }

    @Override
    public Employee searchEmployee(String name) {
        List<Employee> employees = convertToEmployee(FileUtils.readFile(PATH));
        for (Employee valueSearch : employees) {
            if (valueSearch.getName().equals(name)) {
                return valueSearch;
            }
        }
        FileUtils.writeFile(PATH, convertToString(employees));
        return null;
    }

    @Override
    public Employee searchEmployeeById(String id) {
        List<Employee> employees = convertToEmployee(FileUtils.readFile(PATH));
        for (Employee valueIdSearch : employees) {
            if (valueIdSearch.getEmployeeCode().equals(id)) {
                return valueIdSearch;
            }
        }
        FileUtils.writeFile(PATH, convertToString(employees));
        return null;
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employeeList = convertToEmployee(FileUtils.readFile(PATH));
        employeeList.add(employee);
        FileUtils.writeFile(PATH, convertToString(employeeList));
    }

    @Override
    public List<Employee> getList() {
        return convertToEmployee(FileUtils.readFile(PATH));
    }

    public List<String> convertToString(List<Employee> employeeList) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employeeList) {
            strings.add(employee.getName() + COMMA +
                    employee.getDateOfBirth() + COMMA +
                    employee.getGender() + COMMA +
                    employee.getNumberIDCard() + COMMA +
                    employee.getNumberPhone() + COMMA +
                    employee.getEmail() + COMMA +
                    employee.getEmployeeCode() + COMMA +
                    employee.getAcademicLevel() + COMMA +
                    employee.getJobPosition() + COMMA +
                    employee.getSalary());
        }
        return strings;
    }

    public List<Employee> convertToEmployee(List<String> strings) {
        List<Employee> employees = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            employees.add(new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], Integer.parseInt(data[9])));
        }

        return employees;
    }
}
