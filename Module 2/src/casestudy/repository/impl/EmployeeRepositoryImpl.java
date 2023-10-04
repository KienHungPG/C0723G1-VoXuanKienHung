package casestudy.repository.impl;

import FuramaResort.utils.FileUtils;
import casestudy.model.person.Employee;
import casestudy.repository.IPersonRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IPersonRepository<Employee> {
    public static final String PATH = "E:\\CG\\Module 2\\src\\casestudy\\data\\employee.csv";
    public static final String COMMA = ",";

    @Override
    public List<Employee> displayList() {
        return readEmployeeFromFile();
    }

    @Override
    public void add(Employee employee) {
        List<Employee> employees = readEmployeeFromFile();
        employees.add(employee);
        writeEmployeeToFile(employees);
    }

    @Override
    public void edit(Employee employee) {
        List<Employee> employees = readEmployeeFromFile();
        for (Employee employee1 : employees) {
            if (employee1.getEmployeeCode().equals(employee.getEmployeeCode())) {
                employee1.setName(employee.getName());
                employee1.setDateOfBirth(employee.getDateOfBirth());
                employee1.setGender(employee.getGender());
                employee1.setNumberIDCard(employee.getNumberIDCard());
                employee1.setNumberPhone(employee.getNumberPhone());
                employee1.setEducationLevel(employee.getEducationLevel());
                employee1.setJobPosition(employee.getJobPosition());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
        writeEmployeeToFile(employees);
    }

    @Override
    public void delete(String id) {
        List<Employee> employees = readEmployeeFromFile();
        for (Employee employee : employees) {
            if (employee.getEmployeeCode().equals(id)) {
                employees.remove(employee);
                break;
            }
        }
        writeEmployeeToFile(employees);
    }

    @Override
    public List<Employee> search(String name) {
        List<Employee> employees = readEmployeeFromFile();
        List<Employee> newEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                newEmployees.add(employee);
            }
        }
        return newEmployees;
    }

    private List<Employee> readEmployeeFromFile() {
        List<String> data = FileUtils.readFile(PATH);
        return convertStringToEmployee(data);
    }

    private void writeEmployeeToFile(List<Employee> employees) {
        List<String> data = convertEmployeeToString(employees);
        FileUtils.writeFile(PATH, data);
    }

    private static List<Employee> convertStringToEmployee(List<String> data) {
        List<Employee> employees = new ArrayList<>();
        for (String str : data) {
            String[] splitStr = str.split(COMMA);
            employees.add(new Employee(splitStr[0], splitStr[1], splitStr[2], splitStr[3], splitStr[4], splitStr[5],
                    splitStr[6], splitStr[7], splitStr[8], Integer.parseInt(splitStr[9])));
        }
        return employees;
    }

    private static List<String> convertEmployeeToString(List<Employee> employees) {
        List<String> data = new ArrayList<>();
        for (Employee employee : employees) {
            data.add(employee.getName()
                    + COMMA + employee.getDateOfBirth()
                    + COMMA + employee.getGender()
                    + COMMA + employee.getNumberIDCard()
                    + COMMA + employee.getNumberPhone()
                    + COMMA + employee.getEmail()
                    + COMMA + employee.getEmployeeCode()
                    + COMMA + employee.getEducationLevel()
                    + COMMA + employee.getJobPosition()
                    + COMMA + employee.getSalary());
        }
        return data;
    }
}
