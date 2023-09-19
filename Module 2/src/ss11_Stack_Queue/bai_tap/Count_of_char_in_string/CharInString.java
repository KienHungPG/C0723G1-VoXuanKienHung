package ss11_Stack_Queue.bai_tap.Count_of_char_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String string = scanner.nextLine();
        String upperCaseString = string.toUpperCase();
        System.out.println("String after uppercase: ");
        System.out.println(upperCaseString);
        String[] words = upperCaseString.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
