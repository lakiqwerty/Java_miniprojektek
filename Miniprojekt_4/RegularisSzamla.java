package Java_miniprojektek.Miniprojekt_4;

import java.util.ArrayList;

public class RegularisSzamla implements BankSzamla {
    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private static int kovSzamlaSzam = 1;
    public ArrayList<Tranzakcio> tranzakciok = new ArrayList<>();

    public RegularisSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        this.egyenleg = egyenleg;
        this.tulNev = tulNev;
        this.szamlaSzam = szamlaSzam;
        ujSzamlaSzam(5);
    }

    private int ujSzamlaSzam(int kovSzamlaSzam) {
        kovSzamlaSzam++;
        return kovSzamlaSzam;
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public double betesz(double osszeg) {
        egyenleg += osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        return this.egyenleg;
    }

    @Override
    public double kivesz(double osszeg) throws NemElegendoOsszegKivetel {
        if (egyenleg >= osszeg) {
            egyenleg -= osszeg;
            tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW,osszeg));
            return this.egyenleg;
        }else {
            throw new NemElegendoOsszegKivetel("Nincs elegendo osszeg a szamlan.");
        }
    }

    @Override
    public String toString() {
        return "RegularisSzamla{" +
                "egyenleg=" + egyenleg +
                ", tulajdonosNeve='" + tulNev + '\'' +
                ", szamlaSzam='" + szamlaSzam + '\'' +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
