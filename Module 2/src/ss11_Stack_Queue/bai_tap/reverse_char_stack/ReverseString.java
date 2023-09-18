package ss11_Stack_Queue.bai_tap.reverse_char_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Vo Xuan Kien Hung";
        String[] newStringWord = string.split(" ");
        System.out.println("Chuỗi trước khi đảo ngược: " + string);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < newStringWord.length; i++) {
            stack.push(newStringWord[i]);
        }
        String newString = "";
        while (!stack.isEmpty()) {
            newString += stack.pop();
            if (!stack.isEmpty()) {
                newString += " ";
            }
        }
        System.out.println("Chuỗi sau khi đảo ngược: " + newString);

    }
}
