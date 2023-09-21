package ss13_search.bai_tap;

import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String inputString = scanner.nextLine();
        String AscendingSubString = "";

        for (int i = 0; i < inputString.length(); i++) {
            String temp = "" + inputString.charAt(i);
            int j = i;

            while (j < inputString.length() - 1 && inputString.charAt(j) <= inputString.charAt(j + 1)) {
                temp += inputString.charAt(j + 1);
                j++;
            }

            if (temp.length() > AscendingSubString.length()) {
                AscendingSubString = temp;
            }
        }

        System.out.println("Longest ascending substring: " + AscendingSubString);
    }
}
