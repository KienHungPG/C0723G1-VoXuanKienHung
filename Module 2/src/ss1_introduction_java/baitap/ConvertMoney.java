package ss1_introduction_java.baitap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        int vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng USD bạn muốn chuyển đổi: ");
        usd = scanner.nextDouble();
        double convert = usd * vnd;
        System.out.println("USD to VND: " + convert + "VNĐ");
    }
}
