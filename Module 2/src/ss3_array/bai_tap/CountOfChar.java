package ss3_array.bai_tap;

import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter your string: ");
        str = scanner.nextLine();
        int cnt = 0;
        System.out.println("Enter the charactor you want to find in the string: ");
        char targetChar = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                cnt++;
            }
        }
        System.out.println("Number of occurrences of the character " + targetChar + " in string is: " + cnt);
    }
}
