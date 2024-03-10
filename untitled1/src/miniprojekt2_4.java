package Java_miniprojektek.untitled1.src;

import java.util.Scanner;

public class miniprojekt2_4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("adjon meg egy karakterlancot: ");
        String karakterLanc = myObj.nextLine();

        String tomoritettString = tomorites(karakterLanc);

        System.out.println("eredmeny: " + tomoritettString);
    }

    public static String tomorites(String str) {
        StringBuilder tomoritett = new StringBuilder();
        int szamol = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                szamol++;
            } else {
                tomoritett.append(str.charAt(i));
                tomoritett.append(szamol);
                szamol = 1;
            }
        }

        return tomoritett.toString();
    }
}
