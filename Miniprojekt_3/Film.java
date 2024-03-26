package Miniprojekt_3;

public class Film {
    protected String filmCim = "";
    protected int filmAr = 0;
    public int[] velemenyek;

    public Film(String filmCim, int filmAr) {
        this.filmCim = filmCim;
        this.filmAr = filmAr;
        this.velemenyek = new int[20];
    }

    public String getFilmCim() {
        return filmCim;
    }

    public void setFilmAr(int filmAr) {
        this.filmAr = filmAr;
    }

    public int getFilmAr() {
        return filmAr;
    }



    public void Velemenyezes(int velemeny) {
        for (int i = 0; i < velemenyek.length; i++) {
            if (velemeny >= 1 && velemeny <= 5) {
                velemenyek[i] = velemeny;
            }else {
                return;
            }
        }
    }
    public int Atlag(int velemenyekAtlag) {
        if (velemenyek.length == 0){
            System.out.println("Ures a velemenyek lista.");
        }else {
            for (int i = 0; i < velemenyek.length; i++) {
                velemenyekAtlag = velemenyekAtlag + velemenyek[i];
                velemenyekAtlag = velemenyekAtlag / velemenyek.length;
            }
        }
        return velemenyekAtlag;
    }

    @Override
    public String toString() {
        return "Film cime: " + filmCim +
                ", Film ara: " + filmAr;
    }
}
