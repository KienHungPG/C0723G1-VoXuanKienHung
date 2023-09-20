package ss13_search.bai_tap;

import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = scanner.nextLine();
        String newString = "";
        String result = "";

        for (int i = 0; i < string.length() - 1; i++) {
            newString += string.charAt(i);
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > string.charAt(i)) {
                    newString += string.charAt(j);
                    i = j;
                }
            }
            result = newString.length() > result.length() ? newString : result;
            newString = "";
        }
        System.out.println(result);
    }
}
