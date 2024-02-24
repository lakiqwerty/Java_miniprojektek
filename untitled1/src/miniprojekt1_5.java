package Java_miniprojektek.untitled1.src;
import java.util.Scanner;

public class miniprojekt1_5 {
    public static void main(String[] args) {
        String szo;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Adja meg a stringet");
        szo = myObj.nextLine();
        boolean eredmeny = szo.matches("[a-zA-Z]+");
        System.out.println(eredmeny + " (true: a string csak betuket tartalmaz, false: a string nem csak betuket tartalmaz)");
    }
}
