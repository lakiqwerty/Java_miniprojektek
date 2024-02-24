package Java_miniprojektek.untitled1.src;
import java.util.Scanner;

public class miniprojekt1_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int szam1, szam2;
        char operator;
        System.out.println("ird be az elso szamot: ");
        szam1 = myObj.nextInt();
        System.out.println("ird be az operatort: ");
        operator = myObj.next().charAt(0);
        System.out.println("ird be a masodik szamot: ");
        szam2 = myObj.nextInt();

        if (operator == '+') {
            System.out.println("az eredmeny: " + (szam1 + szam2));
        }
        if (operator == '-'){
            System.out.println("az eredmeny: " + (szam1 - szam2));
        }
        if (operator == '*') {
            System.out.println("az eredmeny: " + (szam1 * szam2));
        }
        if (operator == '/'){
            System.out.println("az eredmeny: " + (szam1 / szam2));
        }
    }
}