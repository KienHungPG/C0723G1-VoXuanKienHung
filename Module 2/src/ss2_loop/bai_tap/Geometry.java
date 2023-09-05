package ss2_loop.bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int height;
        int width;
        int lenght;
        System.out.println("MENU");
        System.out.println("1. Print the rectangle.");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right).");
        System.out.println("3. Print isosceles triangle.");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Nhập chiều rộng HCN: ");
                width = scanner.nextInt();
                System.out.println("Nhập chiều dài HCN: ");
                lenght = scanner.nextInt();
                for (int i = 0; i < width; i++) {
                    System.out.println();
                    for (int j = 0; j < lenght; j++) {
                        System.out.print("*");
                    }
                }
            }
            case 2 -> {
                System.out.println("Nhập chiều cao của tam giác: ");
                height = scanner.nextInt();
                for (int i = 0; i < height; i++) {
                    System.out.print("\n");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
                for (int i = 0; i < height; i++) {
                    System.out.print("\n");
                    for (int j = height; j > i; j--) {
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
                for (int i = 0; i < height; i++) {
                    System.out.print("\n");
                    for (int j = height - 1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
                for (int i = 0; i < height; i++) {
                    System.out.print("\n");
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= height - i - 1; k++) {
                        System.out.print("*");
                    }
                }
                System.out.println("\n");
            }
            case 3 -> {
                System.out.println("Nhập chiều cao của tam giác: ");
                height = scanner.nextInt();
                for (int i = 0; i < height; i++) {
                    System.out.print("\n");
                    for (int j = 0; j <= height + i; j++) {
                        if (j < height - i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
            case 4 -> System.exit(4);
            default -> System.out.println("No choice");
        }
    }
}
