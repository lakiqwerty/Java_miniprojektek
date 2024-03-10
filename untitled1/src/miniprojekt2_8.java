package Java_miniprojektek.untitled1.src;

import java.util.Arrays;

public class miniprojekt2_8 {
    public static void main(String[] args) {
        int[] tomb = {3, 2, 4, 5, 6, 1};

        System.out.println("eredeti tomb: " + Arrays.toString(tomb));
        Arrays.sort(tomb);
        System.out.println("a tomb rendezes utan: " + Arrays.toString(tomb));
    }
}
//sajnos csak sort-tal tudtam megoldani