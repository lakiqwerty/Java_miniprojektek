package Java_miniprojektek.Miniprojekt_4;

public class Teszter {
    public static void main(String[] args) throws NemElegendoOsszegKivetel {
        RegularisSzamla regularisSzamla = new RegularisSzamla(1000, "Szep Magdolna",92375);
        FolyoSzamla folyoSzamla = new FolyoSzamla(2000, "Kedves Ferenc", 62136);
        TakarekSzamla takarekSzamla = new TakarekSzamla(1000, "Szabo Jolan", 2136, 5);
        System.out.println(regularisSzamla.toString());
        System.out.println(folyoSzamla.toString());
        System.out.println(takarekSzamla.toString());
        System.out.println("-----------------------------------");
        try {
            regularisSzamla.betesz(500);
            regularisSzamla.betesz(500);
            regularisSzamla.betesz(500);
            regularisSzamla.betesz(500);
            regularisSzamla.kivesz(100);
            folyoSzamla.kivesz(100);
            folyoSzamla.kivesz(100);
            folyoSzamla.kivesz(100);
            folyoSzamla.kivesz(100);
            folyoSzamla.levonKoltseg();
            takarekSzamla.hozzaadKamat();
        } catch (NemElegendoOsszegKivetel e) {
            System.out.println("Nem elegendo az osszeg a kivetelhez.");
        }
        System.out.println(regularisSzamla.toString());
        System.out.println(folyoSzamla.toString());
        System.out.println(takarekSzamla.toString());
        System.out.println("-----------------------------------");
        System.out.println("Folyo Szamla equals: " + folyoSzamla.equals(new FolyoSzamla(2000, "Kedves Ferenc", 62136)));
        System.out.println("Takarek Szamla equals: " + takarekSzamla.equals(new TakarekSzamla(5000, "Szabo Jolan", 2136, 5)));
        System.out.println("-----------------------------------");

        System.out.println("Regularis Szamla DEPOSIT tranzakcioi: ");
        for (Tranzakcio tranzakcio : regularisSzamla.tranzakciok) {
            if (tranzakcio.tranzTipus == TranzakcioTipus.DEPOSIT)
                System.out.println(tranzakcio.toString());
        }
        System.out.println("-----------------------------------");
    }
}

