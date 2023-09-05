package ss3_array.bai_tap;

import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 15, 6, 9};
        int x;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("Enter the element you want to delete: ");
        x = scanner.nextInt();
        deleteValue(x, arr);
    }
    public static void deleteValue(int x, int[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                arr[i] = 0;
                index = 1;
                for (;i < arr.length - 1; i++){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("Array after delete element " + x + " at position " + index + " is: " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
