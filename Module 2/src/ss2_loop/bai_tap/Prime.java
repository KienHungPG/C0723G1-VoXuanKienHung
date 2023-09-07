package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int cnt = 0;
        System.out.println("Nhập số lượng số nguyên tố: ");
        num = scanner.nextInt();
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; cnt < num; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                cnt++;
            }
        }
    }

    public static boolean checkPrime(int number) {
        int i = 2;
        boolean check = true;
        while (i <= number / 2) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        if (check) {
            return true;
        } else {
            return false;
        }
    }
}
