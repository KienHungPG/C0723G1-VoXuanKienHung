package ss13_search.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the size of the array: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size <= 0 || size > 20) {
                System.out.print("Invalid array size! Please re-enter: ");
            }
        } while (size <= 0 || size > 20);
        int[] array = new int[size];
        int number;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1)+": ");
            number = Integer.parseInt(scanner.nextLine());
            array[i] = number;
        }
        System.out.println("Your array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("The array is sorted in ascending order: " + Arrays.toString(array));
        System.out.print("Enter the number you want to find index: ");
        int value = Integer.parseInt(scanner.nextLine());
        int index = binarySearch(array, 0, array.length - 1, value);
        System.out.println("Index of element is: " + index);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        if (right >= left) {
            middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }
            return binarySearch(array, left, middle - 1, value);
        }
        return -1;
    }
}
