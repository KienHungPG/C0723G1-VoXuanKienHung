package casestudy.model.person;

import java.util.Date;

public class Person {
    private String name;
    private Date dateOfBirth;
    private String gender;
    private int numberIDCard;
    private int numberPhone;
    private String email;

    public Person() {
    }

    public Person(String name, Date dateOfBirth, String gender, int numberIDCard, int numberPhone, String email) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.numberIDCard = numberIDCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberIDCard() {
        return numberIDCard;
    }

    public void setNumberIDCard(int numberIDCard) {
        this.numberIDCard = numberIDCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", numberIDCard=" + numberIDCard +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
