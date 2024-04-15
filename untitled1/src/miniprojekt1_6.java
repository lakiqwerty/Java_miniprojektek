package Java_miniprojektek.untitled1.src;
import java.util.Arrays;

public class miniprojekt1_6 {
public static void main(String[] args) {
        int[] tomb1 = new int [] {1,2,3,4};
        int[] tomb2 = new int [] {1,2,3,5};
        int[] tomb3 = new int [] {1,2,3,6};
        int[] tomb4 = new int [] {1,2,3,6};

        System.out.println("A tomb1 egyenlo-e a tomb2-vel? :" + Arrays.equals(tomb1, tomb2));
        System.out.println("A tomb3 egyenlo-e a tomb4-gyel? :" + Arrays.equals(tomb3, tomb4));
    }
}
