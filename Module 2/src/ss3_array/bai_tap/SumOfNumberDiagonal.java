package ss3_array.bai_tap;

import java.util.Scanner;

public class SumOfNumberDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;

        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter the element [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\nMatrix = ");
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == i) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of number on the main diagonal is: " + sum);
    }
}
