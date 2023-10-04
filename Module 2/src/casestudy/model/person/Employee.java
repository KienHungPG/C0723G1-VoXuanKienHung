package casestudy.model.person;

public class Employee extends Person {
    private String employeeCode;
    private String educationLevel;
    private String jobPosition;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeCode, String educationLevel, String jobPosition, int salary) {
        this.employeeCode = employeeCode;
        this.educationLevel = educationLevel;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String gender, String numberIDCard, String numberPhone, String email, String employeeCode, String educationLevel, String jobPosition, int salary) {
        super(name, dateOfBirth, gender, numberIDCard, numberPhone, email);
        this.employeeCode = employeeCode;
        this.educationLevel = educationLevel;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Code = " + employeeCode +
                ", Name = " + getName() +
                ", Date Of Birth = " + getDateOfBirth() +
                ", Gender = " + getGender() +
                ", ID Card = " + getNumberIDCard() +
                ", Phone Number = " + getNumberPhone() +
                ", Email = " + getEmail() +
                ", Education Level = " + educationLevel +
                ", Job Position = " + jobPosition +
                ", Salary = " + salary + "\n";
    }
}
