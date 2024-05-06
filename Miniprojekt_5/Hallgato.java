package Java_miniprojektek.Miniprojekt_5;

import java.util.ArrayList;

public class Hallgato {
    public static int id = 0;
    public final String vezetekNev;
    public final String keresztNev;
    ArrayList<Jegy> jegyek = new ArrayList<>();


    public Hallgato(String vezetekNev, String keresztNev) {
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
    }

    public int getID() {
        return id;
    }

    public String getVezetekNev() {
        return vezetekNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public Double tantargyAtlag(String tantargy) {
        int sum = 0;
        int count = 0;
        for (Jegy j : jegyek) {
            if (j.getTanTargy().equals(tantargy)) {
                sum += j.getJegy();
                count++;
            }
        }
        return count == 0 ? null : (double) sum / count;
    }





    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy j : jegyek) {
            String tantargy = j.getTanTargy();
            if (!tantargyak.contains(j.getTanTargy())) {
                tantargyak.add(tantargy);
            }
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println(getVezetekNev() + " " + getKeresztNev());
        for (String tantargy : getTantargyak()) {
            System.out.println(tantargy + ": " + String.format("%.1f", tantargyAtlag(String.valueOf(tantargy))));
        }
    }
}
