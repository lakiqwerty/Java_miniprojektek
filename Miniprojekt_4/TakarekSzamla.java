package Java_miniprojektek.Miniprojekt_4;

public class TakarekSzamla extends RegularisSzamla{
    private double kamatRata;

    public TakarekSzamla(double egyenleg, String tulNev, int szamlaSzam, double kamatRata) {
        super(egyenleg, tulNev, szamlaSzam);
        this.kamatRata = kamatRata;
    }

    @Override
    public double betesz(double osszeg) {
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        return super.betesz(osszeg);
    }

    @Override
    public double kivesz(double osszeg) throws NemElegendoOsszegKivetel {
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW,osszeg));
        return super.kivesz(osszeg);
    }

    public void hozzaadKamat() {
        double kamat = egyenleg * (kamatRata / 100);
        betesz(kamat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TakarekSzamla)) return false;
        TakarekSzamla that = (TakarekSzamla) o;
        return this.tulNev == that.tulNev &&
                this.szamlaSzam == that.szamlaSzam &&
                this.kamatRata == that.kamatRata;
    }


    @Override
    public String toString() {
        return "TakarekSzamla{" +
                "kamatRata=" + kamatRata +
                ", egyenleg=" + egyenleg +
                ", tulNeve='" + tulNev + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
