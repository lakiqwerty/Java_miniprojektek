package Miniprojekt_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Teszter {
    public static void main(String[] args) {
        ArrayList<Film> lista = new ArrayList<>();

        Film film1 = new Film("The Amazing Spider-Man 2",50);
        Film film2 = new Film("Uncharted",60);
        Film film3 = new Film("Kung Fu Panda 2",40);
        Film film4 = new Film("The Expendables 3",30);
        Film film5 = new Film("The Last Airbender",70);
        Film film6 = new Film("Good Morning, Vietnam",10);

        lista.add(film1);
        lista.add(film2);
        lista.add(film3);
        lista.add(film4);
        lista.add(film5);
        lista.add(film6);

        HorrorFilm horrorFilm1 = new HorrorFilm("The Ring",80,20);
        HorrorFilm horrorFilm2 = new HorrorFilm("A Nightmare on Elm Street",20,18);
        HorrorFilm horrorFilm3 = new HorrorFilm("Friday the 13th",30,18);
        HorrorFilm horrorFilm4 = new HorrorFilm("It",40,16);
        HorrorFilm horrorFilm5 = new HorrorFilm("The shining",60,16);
        HorrorFilm horrorFilm6 = new HorrorFilm("Saw",70,21);

        lista.add(horrorFilm1);
        lista.add(horrorFilm2);
        lista.add(horrorFilm3);
        lista.add(horrorFilm4);
        lista.add(horrorFilm5);
        lista.add(horrorFilm6);

        for (Film film : lista) {
            System.out.println(film);
        }

        System.out.println("-------------------------------------------------");

        lista.sort(Comparator.comparing((Film film) -> (film.getFilmAr())));

        for (Film film : lista) {
            System.out.println(film);
        }

        ArrayList<IKorhataros> listaHorror = new ArrayList<>();
        System.out.println("-------------------------------------------------");
        for (Film hfilm : lista) {
            if(hfilm instanceof HorrorFilm) {
                listaHorror.add((IKorhataros) hfilm);
            }
        }
        for (IKorhataros hfilm : listaHorror) {
            System.out.println(hfilm);
        }
        System.out.println("-------------------------------------------------");
        int kor = 16;
        int buntetesOssz = 0;

        for (IKorhataros hfilm : listaHorror) {
            buntetesOssz += hfilm.Buntetes(kor);
            System.out.println(buntetesOssz);
        }

    }
}
