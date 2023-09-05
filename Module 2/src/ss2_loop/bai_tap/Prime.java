package ss2_loop.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, cnt = 0;
        System.out.println("Nhập số lượng số nguyên tố: ");
        num = scanner.nextInt();
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; cnt < num; i++) {
            if (checkPrime(i)){
                System.out.println(i);
                cnt++;
            }
        }
    }

    public static boolean checkPrime(int number){
        int cnt = 0;
        boolean result = true;
        if (number < 2){
            result = false;
        }else {
            for (int i = 1; i < Math.sqrt(number); i++) {
                if (number % i == 0){
                    cnt++;
                }
                result = cnt < 2;
            }
        }
        return result;
    }
}
