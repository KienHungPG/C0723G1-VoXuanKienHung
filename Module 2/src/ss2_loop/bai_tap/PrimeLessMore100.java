package ss2_loop.bai_tap;

public class PrimeLessMore100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố lần lượt là: ");
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)){
                System.out.println(i);
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

