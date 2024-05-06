package Java_miniprojektek.Miniprojekt_5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes( new Jegy("Matek", 10));
        hallgato.ujBejegyzes( new Jegy("Matek", 8));hallgato.ujBejegyzes( new Jegy("Roman", 7));
        hallgato.ujBejegyzes( new Jegy("Roman", 8));
        hallgato.ujBejegyzes( new Jegy("Magyar", 9));
        hallgato.listazas();
        System.out.println(new File(".").getAbsolutePath());

        System.out.println("---------------------------------");

        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();
        System.out.println("---------------------------------");

        String path = ("jegyek.csv");

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                int id = Integer.parseInt(value[0]);
                String tantargy = value[1];
                int jegy = Integer.parseInt(value[2]);

                Jegy jegyek = new Jegy(tantargy, jegy);
                naplo.ujJegy(id, jegyek);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        naplo.listazHallgatoiAdatok();
    }
}
