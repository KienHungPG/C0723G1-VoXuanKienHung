package FuramaResort.model.person;

import java.util.Date;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer(){
    }
    public Customer(String customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, Date dateOfBirth, String gender, int numberIDCard, int numberPhone, String email, String customerCode, String customerType, String address) {
        super(name, dateOfBirth, gender, numberIDCard, numberPhone, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
