package Java_miniprojektek.Miniprojekt_3;

public class HorrorFilm extends Film implements IKorhataros{

    private int korh;
    public HorrorFilm(String filmCim, int filmAr, int korh) {
        super(filmCim, filmAr);
        this.korh = korh;
    }
    public int Korhatar() {
        return korh;
    }
    public int Buntetes(int kor){
        if ((kor-korh)<0){
            return Math.abs(kor-korh)*getFilmAr();
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Film cime: " + filmCim +
                ", Film ara: " + filmAr +
                ", Film korhatara: " + korh;
    }
}

