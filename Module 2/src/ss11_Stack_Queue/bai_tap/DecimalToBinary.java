package ss11_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want to convert: ");
        int number = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        int i = 0;
        while (number > 0){
            i+= number % 2 *Math.pow(10,n);
            n++;
            number /= 2;
        }
        stack.push(i);
        System.out.println(stack);
    }
}
