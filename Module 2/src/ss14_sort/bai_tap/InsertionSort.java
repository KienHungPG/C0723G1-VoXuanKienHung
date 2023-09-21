package ss14_sort.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the array size: ");
            size = Integer.parseInt(scanner.nextLine());
            if (size >= 20 || size <= 0) {
                System.out.print("Invalid size! Re-enter: ");
            }
        } while (size >= 20 || size <= 0);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sort: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
