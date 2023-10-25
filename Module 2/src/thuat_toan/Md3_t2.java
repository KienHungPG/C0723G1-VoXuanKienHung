package thuat_toan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Md3_t2 {
    public int[] solution(int[][] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int[] row : arr) {
            for (int number : row) {
                if (isPrime(number)){
                    hashSet.add(number);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    };
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

