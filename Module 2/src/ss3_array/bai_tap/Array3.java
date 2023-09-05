package ss3_array.bai_tap;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i < arr1.length) {
            System.out.print("Enter element " + (i + 1) + " of array 1 : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        while (j < arr2.length) {
            System.out.print("Enter element " + (j + 1) + " of array 2 : ");
            arr2[j] = scanner.nextInt();
            j++;
        }

        for (int k = 0; k < arr1.length; k++) {
            arr3[k] = arr1[k];
            arr3[k + arr1.length] = arr2[k];
        }
        System.out.println("Array after merge: ");
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + "\t");
        }
    }
}
