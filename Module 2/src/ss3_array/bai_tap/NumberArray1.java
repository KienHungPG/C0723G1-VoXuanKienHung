package ss3_array.bai_tap;
import java.util.Scanner;

public class NumberArray1 {
    public static void main(String[] args) {
        int element;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter number of element of Array: ");
            element = scanner.nextInt();
            if (element > 0) {
                break;
            } else {
                System.out.println("Number of element must be greater than 0");
            }
        } while (true);
        array = new int[element];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " of array : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Your array is: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        System.out.println();
        int deleteElement;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element that you want to delete: ");
        deleteElement = input.nextInt();

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                index = i;
                System.out.println("Index of " + deleteElement + " is: " + index);
            }
        }
        if (index == 0) {
            System.out.println(deleteElement + " not found in array");
        } else {
            int[] array1 = new int[array.length];
            int count = 0;
            for (int k : array) {
                if (deleteElement == k) {
                    continue;
                }
                array1[count] = k;
                count++;
            }
            System.out.println("Array after delele element is: ");
            for (int i : array1) {
                System.out.print(i + " ");
            }
        }
    }
}