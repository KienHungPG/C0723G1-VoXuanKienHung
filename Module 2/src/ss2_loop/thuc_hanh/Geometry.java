package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Vẽ hình tam giác.");
        System.out.println("2. Vẽ hình vuông.");
        System.out.println("3. Vẽ hình chữ nhật.");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
            }
            case 2 -> {
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            }
            case 3 -> {
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
            }
            case 0 -> System.exit(0);
            default -> System.out.println("No choice!");
        }
    }
}
