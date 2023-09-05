package ss3_array.bai_tap;

import java.util.Scanner;

public class NumberArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int x, index;
        System.out.print("Your array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        do {
            System.out.print("Enter a element you want to insert to array: ");
            x = scanner.nextInt();
            System.out.print("Enter a position you want to insert element: ");
            index = scanner.nextInt();
            if (index < 0 || index > arr.length){
                System.out.print("Please enter a valid position \n");
            }else {
                insertElement(arr, index,x);
                break;
            }
        }while (true);
    }
    public static void insertElement(int[] arr, int index, int x){
        for (int i = arr.length-2; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = x;
        System.out.print("Array after insert the element is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
