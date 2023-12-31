package ss3_array.bai_tap;

import java.util.Scanner;

public class SumOfColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element row " + (i + 1) + ", col " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Your matrix: ");
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("Enter the column you want to sum: ");
        int column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][column];
        }
        System.out.println("The sum of the numbers in column " + column + " is: " + sum);
    }
}
