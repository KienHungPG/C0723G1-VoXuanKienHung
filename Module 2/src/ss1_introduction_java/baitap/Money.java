package ss1_introduction_java.baitap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng USD bạn muốn chuyển đổi: ");
        usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("USD to VND: " + vnd + "VNĐ");
    }
}
