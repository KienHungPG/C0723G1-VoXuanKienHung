package ss3_array.bai_tap;

import java.util.Scanner;

public class InsertedNumberArray {
    public static void main(String[] args) {
        int element;
        int[] array;
        int index;
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
        do {
            System.out.print("Enter a element you want to insert to array: ");
            element = scanner.nextInt();
            System.out.print("Enter a position you want to insert element: ");
            index = scanner.nextInt();
            if (index < 0 || index > array.length) {
                System.out.print("Please enter a valid position \n");
            } else {
                insertElement(array, index, element);
                break;
            }
        } while (true);
    }

    public static void insertElement(int[] arr, int index, int element) {
        for (int i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
        System.out.print("Array after insert the element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
