package ss3_array.bai_tap;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("Enter the element [%d][%d]: ", i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Your matrix: ");
        for(int i = 0; i < rows; i++){
            System.out.println();
            for (int j = 0; j < cols; j++){
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println();
        int max = array[0][0];
        for(int i = 0; i < rows; i++){
            for (int j = 1; j < cols; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max value in matrix: " +max);
    }
}