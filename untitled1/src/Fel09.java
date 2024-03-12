package Java_miniprojektek.untitled1.src;

public class Fel09 {
    public static void main(String[] args) {
        int[][] tomb = new int[10][10];

        tombFeltoltes(tomb);

        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tombFeltoltes(int[][] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                if (i == j) {
                    tomb[i][j] = i;//foatlo elemei
                }
            }
        }
    }
}
