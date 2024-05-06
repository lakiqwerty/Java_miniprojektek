package Java_miniprojektek.Miniprojekt_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {
    private ArrayList<Hallgato> hallgatok = new ArrayList<>();

    public Naplo(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                if (value.length == 2) {
                    Hallgato hallgato = new Hallgato(value[0], value[1]);
                    hallgatok.add(hallgato);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void listazNevek() {
        for (int i = 0; i < hallgatok.toArray().length; i++) {
            System.out.println((i + 1) + ". " + hallgatok.get(i).getVezetekNev() + " " + hallgatok.get(i).getKeresztNev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        if (ID > 0 && ID <= hallgatok.size()) {
            Hallgato hallgato = hallgatok.get(ID - 1);
            hallgato.ujBejegyzes(jegy);
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            hallgato.listazas();
            System.out.println("--------------------");
        }
    }
}