package Java_miniprojektek.untitled1.src;

public class miniprojekt2_3 {
    public static void main(String[] args) {
        String karakterLanc = "sdfj hsjdjh glisjdg";
        String eredmeny = ismetlesekTorlese(karakterLanc);
        System.out.println("eredeti karakterlanc: " + karakterLanc);
        System.out.println("eredmeny: " + eredmeny);
    }

    public static String ismetlesekTorlese(String szoveg) {
        char[] tomb = szoveg.toCharArray();

        for (int i = 0; i < tomb.length; i++) {
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] == tomb[j]) {
                    tomb[j] = ' ';
                }
            }
        }

        StringBuilder eredmeny = new StringBuilder();
        for (char k : tomb) {
            if (k != ' ') {
                eredmeny.append(k);
            }
        }
        return eredmeny.toString();
    }
}
