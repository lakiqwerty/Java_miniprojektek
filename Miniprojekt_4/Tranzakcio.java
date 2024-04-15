package Java_miniprojektek.Miniprojekt_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TranzakcioTipus {
    DEPOSIT, WITHDRAW
}

public class Tranzakcio {
    public LocalDateTime idopont = LocalDateTime.now();
    public TranzakcioTipus tranzTipus;
    public double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return "Tranzakcio{" +
                "idopont=" + idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) +
                ", tranzTipus=" + tranzTipus +
                ", osszeg=" + osszeg +
                '}';
    }

}




