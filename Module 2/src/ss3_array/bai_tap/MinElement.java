package ss3_array.bai_tap;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("The element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Your array is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min){
                min = array[j];
            }
        }
        System.out.println("The min element is: " +min);
    }
}
