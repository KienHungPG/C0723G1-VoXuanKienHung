package thuat_toan;

public class ThuatToan2 {
    boolean solution(int[] a) {

        for(int i = 1; i < a.length-1;i++){
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += a[j];
            }
            for (int j = i+1; j < a.length; j++) {
                sum2 += a[j];
            }
            if(sum1 == sum2){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ThuatToan2 thuatToan2 = new ThuatToan2();
        int[] arr = {1, 2, 3, 3};
        boolean result = thuatToan2.solution(arr);
        System.out.println(result);
    }
}
