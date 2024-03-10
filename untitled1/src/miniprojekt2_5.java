package Java_miniprojektek.untitled1.src;

import java.util.Arrays;

public class miniprojekt2_5 {
    public static void main(String[] args) {
        int[] tomb = {7, 2, 6, 4, 2};

        System.out.println("eredeti tomb: " + Arrays.toString(tomb));

        elsoEsUtolsoCsere(tomb);

        System.out.println("modositott tomb: " + Arrays.toString(tomb));
    }
    public static void elsoEsUtolsoCsere(int[] ujTomb) {
        int csere = ujTomb[0];
        ujTomb[0] = ujTomb[ujTomb.length - 1];
        ujTomb[ujTomb.length - 1] = csere;
    }
}
