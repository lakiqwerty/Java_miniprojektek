package Java_miniprojektek.Miniprojekt_5;

public class Jegy {
    public String tanTargy;
    public int jegy;

    public Jegy(String tanTargy, int jegy) {
        this.tanTargy = tanTargy;
        this.jegy = jegy;
    }

    public String getTanTargy() {
        return tanTargy;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Jegy{" +
                "tanTargy='" + tanTargy + '\'' +
                ", jegy=" + jegy +
                '}';
    }

}
