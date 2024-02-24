package Java_miniprojektek.untitled1.src;
import java.util.Scanner;
public class miniprojekt1_2 {
    static void jelszoTeszt(String jelszo) {
        int i = 1;
        while (i <= 3) {
            Scanner input = new Scanner(System.in);
            String jelszotest = input.nextLine();
            if (jelszo.equals(jelszotest)) {
                System.out.println("Jo");
                break;
            } else {
                int proba = 3 - i;
                if (proba == 0) {
                    System.out.println("nincs tobb probalkozasod");
                } else {
                    System.out.println(proba + " probalkozasod maradt");
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        String jelszo = "aHew43J";
        jelszoTeszt(jelszo);
    }
}