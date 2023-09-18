package ss11_Stack_Queue.bai_tap;

import java.util.*;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String string = scanner.nextLine().replaceAll("\\s+","").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i = string.length()-1; i >= 0 ; i--) {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (string.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
