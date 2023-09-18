package ss11_Stack_Queue.bai_tap.reverse_char_stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] newArray = new int[array.length];
        System.out.println("Mảng trước khi đảo ngược: " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo nguược: " + Arrays.toString(newArray));
    }
}
