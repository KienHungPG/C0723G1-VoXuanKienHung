package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        System.out.println("Nhập số lượng số nguyên tố: ");
        number = scanner.nextInt();
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; count < number; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean checkPrime(int number) {
        int count = 0;
        boolean result = true;
        if (number < 2) {
            result = false;
        } else {
            for (int i = 1; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    count++;
                }
                result = count < 2;
            }
        }
        return result;
    }
}
