package ss3_array.bai_tap;

import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter your string: ");
        string = scanner.nextLine();
        int count = 0;
        System.out.println("Enter the charactor you want to find in the string: ");
        char targetChar = scanner.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Number of occurrences of the character " + targetChar + " in string is: " + count);
    }
}
