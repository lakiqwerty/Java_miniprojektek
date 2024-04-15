package Java_miniprojektek.Miniprojekt_4;

public class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama;
    private static final int INGYENES_TRANZ_SZAMA = 3;
    private static final double TRANZAKCIO_ARA = 2.0;

    public FolyoSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        super(egyenleg, tulNev, szamlaSzam);
        this.tranzakciokSzama = 0;
    }

    @Override
    public double betesz(double osszeg) {
        tranzakciokSzama++;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        return super.betesz(osszeg);
    }

    @Override
    public double kivesz(double osszeg) throws NemElegendoOsszegKivetel {
        tranzakciokSzama++;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW,osszeg));
        return super.kivesz(osszeg);
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > INGYENES_TRANZ_SZAMA) {
            double levonandoOsszeg = TRANZAKCIO_ARA * (tranzakciokSzama - INGYENES_TRANZ_SZAMA);
            try {
                kivesz(levonandoOsszeg);
            }catch (NemElegendoOsszegKivetel e) {
                System.out.println("Nem elegendo az osszeg a kivetelhez.");
            }
        }
        tranzakciokSzama = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FolyoSzamla)) return false;
        FolyoSzamla that = (FolyoSzamla) o;
        return this.tulNev == that.tulNev &&
        this.szamlaSzam == that.szamlaSzam &&
        this.tranzakciokSzama == that.tranzakciokSzama;
    }


    @Override
    public String toString() {
        return "FolyoSzamla{" +
                "tranzakciokSzama=" + tranzakciokSzama +
                ", egyenleg=" + egyenleg +
                ", tulNeve='" + tulNev + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
