package ss19_string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateOfClassesName {
    private static final String NAME_PATTERN = "^[CAP]\\d{4}+[GHIK]$";

    public ValidateOfClassesName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateOfClassesName validateOfClassesName = new ValidateOfClassesName();

        System.out.print("Enter name of class: ");
        String inputValue = scanner.nextLine();

        boolean isValid = validateOfClassesName.validate(inputValue);
        if (isValid) {
            System.out.println("Name of class is valid.");
        } else {
            System.out.println("Name of class is not valid .");
        }
    }
}