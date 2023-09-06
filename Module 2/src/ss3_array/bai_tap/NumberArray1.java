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
        System.out.print("Enter the element that you want to delete: ");
        int delNumber = scanner.nextInt();
        boolean check = false;
        int indexDel;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == delNumber) {
                check = true;
                indexDel = i;
                int temp;
                for (int j = indexDel; j < array.length - 1; j++) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        //display array after delete delElement
        if (check) {
            System.out.print("Your array after delete element" + delNumber + " is: ");
            for (int j : array) {
                System.out.print(j + " ");
            }
        } else {
            System.out.println(delNumber + " not found in array");
        }
    }
}