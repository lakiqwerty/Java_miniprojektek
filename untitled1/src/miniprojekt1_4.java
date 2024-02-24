package Java_miniprojektek.untitled1.src;
import java.util.Scanner;

public class miniprojekt1_4 {
    public static void main(String[] args) {
        int sorok;
        Scanner myObj = new Scanner(System.in);
        System.out.println("adja meg a sorok szamat: ");
        sorok = myObj.nextInt();

        for (int i = 1; i <= sorok; ++i) {
            for (int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}