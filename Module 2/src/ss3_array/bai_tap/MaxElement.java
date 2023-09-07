package ss3_array.bai_tap;

import java.util.Scanner;

import java.util.Scanner;

public class MaxElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Tạo ma trận và biến lưu giá trị lớn nhất và tọa độ
        double[][] matrix = new double[rows][cols];
        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        // Nhập giá trị cho ma trận và tìm giá trị lớn nhất
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element row " + (i + 1) + ", col " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.print("Your matrix: ");
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("Max element in the matrix is: " + maxElement);
        System.out.println("Position of the max element at row " + (maxRow + 1) + ", col " + (maxCol + 1));

    }
}
