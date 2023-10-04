package casestudy.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_VALIDATE = "^(.+)@(\\S+)$";
    private static final String EMPLOYEE_CODE = "^NV-\\d{4}$";
    private static final String NAME_VALIDATE = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String NUMBER_ID_CARD = "^(\\d{9}|\\d{12})$";
    private static final String NUMBER_PHONE = "^0\\d{9}$";
    private static final String CUSTOMER_CODE = "^KH-\\d{4}$";
    private static final String CUSTOMER_TYPE = "^(Diamond|Platinum|Gold|Silver|Member)$";
    private static final String VILLA_CODE = "^SVVL-\\d{4}$";
    private static final String SERVICE_NAME = "^[A-Z][a-z]*$";
    private static final String RENT_TYPE = "^(Year|Month|Day|Hourly)$";

    public static boolean emailValidate(String email) {
        pattern = Pattern.compile(EMAIL_VALIDATE);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean employeeCodeValidate(String employeeCode) {
        pattern = Pattern.compile(EMPLOYEE_CODE);
        matcher = pattern.matcher(employeeCode);
        return matcher.matches();
    }
    public static boolean nameValidate(String employeeName) {
        pattern = Pattern.compile(NAME_VALIDATE);
        matcher = pattern.matcher(employeeName);
        return matcher.matches();
    }
    public static boolean ageValidate(String dateOfBirth) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dob = LocalDate.parse(dateOfBirth, dateTimeFormatter);
            if (dateOfBirth.equals(dateTimeFormatter.format(dob))) {
                LocalDate now = LocalDate.now();
                Period period = Period.between(dob, now);
                return period.getYears() >= 18;
            }
            return false;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    public static boolean numberIdCardValidate(String numberIdCard) {
        pattern = Pattern.compile(NUMBER_ID_CARD);
        matcher = pattern.matcher(numberIdCard);
        return matcher.matches();
    }
    public static boolean numberPhoneValidate(String numberPhone) {
        pattern = Pattern.compile(NUMBER_PHONE);
        matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }
    public static boolean customerCodeValidate(String customerCode) {
        pattern = Pattern.compile(CUSTOMER_CODE);
        matcher = pattern.matcher(customerCode);
        return matcher.matches();
    }
    public static boolean customerTypeValidate(String customerType) {
        pattern = Pattern.compile(CUSTOMER_TYPE);
        matcher = pattern.matcher(customerType);
        return matcher.matches();
    }
    public static boolean villaCodeValidate(String serviceCode) {
        pattern = Pattern.compile(VILLA_CODE);
        matcher = pattern.matcher(serviceCode);
        return matcher.matches();
    }
    public static boolean serviceNameValidate(String serviceName) {
        pattern = Pattern.compile(SERVICE_NAME);
        matcher = pattern.matcher(serviceName);
        return matcher.matches();
    }
    public static boolean rentalTypeValidate(String rentalType) {
        pattern = Pattern.compile(RENT_TYPE);
        matcher = pattern.matcher(rentalType);
        return matcher.matches();
    }
}
