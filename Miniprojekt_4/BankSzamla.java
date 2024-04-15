package Java_miniprojektek.Miniprojekt_4;

interface BankSzamla {
    double getEgyenleg();
    double betesz(double osszeg);
    double kivesz(double osszeg) throws NemElegendoOsszegKivetel;
}

class NemElegendoOsszegKivetel extends Exception{
    public NemElegendoOsszegKivetel(String hibaUzenet) {
        super(hibaUzenet);
    }
}