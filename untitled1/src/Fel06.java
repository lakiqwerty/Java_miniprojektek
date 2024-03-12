package Java_miniprojektek.untitled1.src;

import java.util.Arrays;

public class Fel06 {
    public static void main(String[] args) {
        int[] tomb = {12, 5, 7, 4, 7, 0};
        System.out.println("eredeti tomb: " + Arrays.toString(tomb));

        minMaxMegtalalasa(tomb);
    }

    public static void minMaxMegtalalasa(int[] tomb) {
        if (tomb.length > 0) {
            int min = tomb[0];
            int max = tomb[0];

            for (int i = 1; i < tomb.length; i++) {
                if (tomb[i] < min) {
                    min = tomb[i];
                } else if (tomb[i] > max) {
                    max = tomb[i];
                }
            }
            System.out.println("legkisebb elem: " + min);
            System.out.println("legnagyobb elem: " + max);
        }
    }
}
