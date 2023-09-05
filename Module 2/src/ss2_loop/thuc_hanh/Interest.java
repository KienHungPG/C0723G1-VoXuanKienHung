package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất: ");
        interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi bạn nhận được: " + totalInterest);
    }
}
