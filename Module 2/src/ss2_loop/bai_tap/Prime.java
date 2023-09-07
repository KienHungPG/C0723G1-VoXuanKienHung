package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;
        System.out.println("Nhập số lượng số nguyên tố: ");
        num = scanner.nextInt();
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; count < num; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number < 2) {
            return false;
        }
        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
