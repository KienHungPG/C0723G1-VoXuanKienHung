package casestudy.model.person;

import java.util.Date;

public class Employee extends Person{
    private String employeeCode;
    private String academicLevel;
    private String jobPosition;
    private int Salary;

    public Employee(){
    }
    public Employee(String employeeCode, String academicLevel, String jobPosition, int salary) {
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.jobPosition = jobPosition;
        Salary = salary;
    }

    public Employee(String name, Date dateOfBirth, String gender, int numberIDCard, int numberPhone, String email, String employeeCode, String academicLevel, String jobPosition, int salary) {
        super(name, dateOfBirth, gender, numberIDCard, numberPhone, email);
        this.employeeCode = employeeCode;
        this.academicLevel = academicLevel;
        this.jobPosition = jobPosition;
        Salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
