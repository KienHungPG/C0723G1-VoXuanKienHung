package ss2_loop.bai_tap;

public class PrimeLessMore100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

