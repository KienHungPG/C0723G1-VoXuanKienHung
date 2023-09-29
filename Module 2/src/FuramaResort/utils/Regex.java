package FuramaResort.utils;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String GENDER_VALIDATE = "^(Male|Female|Other)$";
    private static final String EMAIL_VALIDATE = "^(.+)@(\\S+)$";
    private static final String EMPLOYEE_CODE = "^NV-\\d{4}$";
    private static final String NAME_VALIDATE = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String NUMBER_ID_CARD = "^(\\d{9}|\\d{12})$";
    private static final String NUMBER_PHONE = "^0\\d{9}$";
    private static final String ACADEMY_LEVEL = "^(Intermediate|College|University|Postgraduate)$";
    private static final String JOB_POSITION = "^(receptionist|serviceman|specialist|supervisor|manager|director)$";
    private static final String CUSTOMER_CODE = "^KH-\\d{4}$";
    private static final String CUSTOMER_TYPE = "^(Diamond|Platinum|Gold|Silver|Member)$";

    public static boolean genderValidate(String gender) {
        pattern = Pattern.compile(GENDER_VALIDATE);
        matcher = pattern.matcher(gender);
        return matcher.matches();
    }
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
    public static boolean ageValidate(String dateOfBirth){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dateOfBirth,dateTimeFormatter);
        LocalDate now = LocalDate.now();
        Period period = Period.between(dob,now);
        return period.getYears() >= 18;
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
    public static boolean academyLevelValidate(String academyLevel) {
        pattern = Pattern.compile(ACADEMY_LEVEL);
        matcher = pattern.matcher(academyLevel);
        return matcher.matches();
    }
    public static boolean jobPositionlValidate(String jobPosition) {
        pattern = Pattern.compile(JOB_POSITION);
        matcher = pattern.matcher(jobPosition);
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
}
