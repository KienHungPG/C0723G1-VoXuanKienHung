package thuat_toan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThuatToan4 {
    int[] solution(int[] a) {
        List<Integer> listPeople = new ArrayList<>();

        for (int height : a) {
            if (height != -1) {
                listPeople.add(height);
            }
        }
        Collections.sort(listPeople);

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = listPeople.get(index);
                index++;
            }
        }

        return a;
    }

}
