package ss2_loop.bai_tap;

public class PrimeLessMore100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
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

