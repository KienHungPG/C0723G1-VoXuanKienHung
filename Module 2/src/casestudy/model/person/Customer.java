package casestudy.model.person;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String mail, String customerCode, String customerType, String address) {
        super(name, dateOfBirth, gender, identityCard, phoneNumber, mail);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {

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

    @Override
    public String toString() {
        return "Id Customer = " + customerCode +
                ", Name = " + getName() +
                ", Date Of Birth = " + getDateOfBirth() +
                ", Gender = " + getGender() +
                ", Identity Card = " + getNumberIDCard() +
                ", Phone Number = " + getNumberPhone() +
                ", Email = " + getEmail() + "," +
                " Customer Type = " + customerType + "," +
                " Address = " + address + "\n";
    }
}
