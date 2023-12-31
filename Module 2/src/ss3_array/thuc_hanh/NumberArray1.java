package ss3_array.thuc_hanh;

import java.util.Arrays;

public class NumberArray1 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 15, 6, 9};
        int index = minValue(arr);
        System.out.println("Your array is: " + Arrays.toString(arr));
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
