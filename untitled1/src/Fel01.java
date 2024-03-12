package Java_miniprojektek.untitled1.src;

import java.util.Scanner;

public class Fel01 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("adjon meg egy szot: ");
        String szo = myObj.nextLine();

        elsoEsUtolso(szo);
    }

    public static void elsoEsUtolso(String szo) {
        int hossz = szo.length();
        char elso = szo.charAt(0);
        char utolso = szo.charAt(hossz - 1);

        System.out.println("elso: " + elso);
        System.out.println("utolso : " + utolso);
    }
}

