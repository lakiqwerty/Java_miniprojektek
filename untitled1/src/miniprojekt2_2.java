package Java_miniprojektek.untitled1.src;

import java.util.Scanner;

public class miniprojekt2_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("adjon meg egy stringet: ");
        String szo = myObj.nextLine();


        String eredmeny = karakterCsereles(szo, 'a', '*');

        System.out.println("eredmeny : " + eredmeny);
    }

    public static String karakterCsereles(String ujTomb, char kicserelendo, char csereKarakter) {
        char[] tomb = ujTomb.toCharArray();

        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] == kicserelendo) {
                tomb[i] = csereKarakter;
            }
        }

        return new String(tomb);
    }
}