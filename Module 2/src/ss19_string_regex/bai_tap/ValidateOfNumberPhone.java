package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateOfNumberPhone {
    private static final String PHONE_PATTERN = "^\\d{2}-0\\d{9}$";

    public ValidateOfNumberPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateOfNumberPhone validateOfNumberPhone = new ValidateOfNumberPhone();
        System.out.println("Enter phone number: ");
        String inputValue = scanner.nextLine();
        boolean isValid = validateOfNumberPhone.validate(inputValue);
        if (isValid) {
            System.out.println("Phone number is valid");
        } else {
            System.out.println("Phone number is not valid");
        }

    }
}
