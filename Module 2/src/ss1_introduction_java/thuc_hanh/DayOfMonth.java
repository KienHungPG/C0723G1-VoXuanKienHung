package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tháng bạn muốn kiểm tra: ");
        int month = scanner.nextInt();

        switch (month) {
            case 2 -> System.out.println("Tháng 2 có 28 hoặc 29 ngày.");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tháng " + month + " có 31 ngày.");
            case 4, 6, 9, 11 -> System.out.println("Tháng " + month + " có 30 ngày.");
            default -> System.out.println("Tháng " + month + " không tồn tại.");
        }
    }
}
