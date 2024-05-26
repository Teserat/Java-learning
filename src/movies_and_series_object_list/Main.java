package movies_and_series_object_list;

import extra_methods.ExtraMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    /*
    Założenie zadania, było utworzenie listy recenzji w postaci obiektów na liście.
    Zostały utworzone 3 Klasy z obiektami, nadrzędna "MaterialReview" i podrzędne diedziczące "FilmReview" i "SeriesReview" (wraz z dodaniem konstruktorów).
    MaterialReview - ma zaimplementowane nadpisanie metody toString, dzięki czemu wywołanie system out print wypisuje dokłądnie to, co przechowuje z stosownym komentarzem.
    W klasie Main wykonywany był kod, w którym najpierw było testowanie klasy z obiektem nadrzędnym i dodawaniem wartości do obiektów poczym testowaniem klas podrzędnych.

    Ostatecznie po sprawdzeniu obiektów, dodana została inicjalizacja listy obiektów dla recenzji dla filmów i seriali oraz kolekcji Set dla możliwości elminacji duplikatów.

    Zasilenie obiektów zostało dodane w odzielnej klasie "ImportObjectList", by zachować czytelność kodu. Też tam są umieszczone metody
    Dodana pętla for by wylistować z warunkiem if, by nie zawsze zaśmiecać terminal.

    */

    public static void main(String[] args) {
        MaterialReview test = new MaterialReview(1, "Conan", null, 1982, "Fajny film", 6.7);
        System.out.println(test);
        test.ocena = 4; // przypisanie bezpośrednie
        MaterialReview test2 = new MaterialReview();

        test2.setNumer(2); // przypisanie z użycem settera <- Użycie setterów pozwala zachować enkapsulację, dodawać logikę walidacji i jest bardziej elastyczne w przypadku zmian w strukturze klasy.
        test2.setTytul("Tokyo Light Up");
        test2.setPlatforma("Disney+");
        test2.setRok(2003);
        test2.setOpis("fake");
        test2.setOcena(0);
        System.out.println(test2);
        ExtraMethods.linia("Zakonczenie testy metody nadrzednej. Rozpoczete testy dziedziczenia i dodanie konstruktora dla recenzji filmow i seriali");

        FilmReview test3 = new FilmReview(99, "testowa nazwa filmu", "brak", 1992, "Fajny film", 3.7);
        SeriesReview test4 = new SeriesReview(1, "testowa nazwa serialu", "brak", 1999, "Fajny serial", 6.1);

        System.out.println(test3);
        System.out.println(test4);

        ExtraMethods.linia("Zakonczenie testow dzialania obiektow. Rozpoczescie pracy z zasileniem obiektow z listy + dodanie kolekcji Set do likwidacji duplikatow");

        List<FilmReview> listaFilmow = new ArrayList<>();
        List<SeriesReview> listaSeriali = new ArrayList<>();

        Set<String> zebraneFilmy = new HashSet<>();
        Set<String> zebraneSeriale = new HashSet<>();
        ImportObjectList.ImportData(listaFilmow, zebraneFilmy, listaSeriali, zebraneSeriale);

        if(false) { //możliwość zablokowania drukowania listy
            for (FilmReview filmy : listaFilmow) {
                System.out.println(filmy);
            }
            for (SeriesReview seriale : listaSeriali) {
                System.out.println(seriale);
            }
        }


        ExtraMethods.linia("Koniec - dodano do listy " + listaFilmow.size() + " filmy i " + listaSeriali.size() + " seriali");
    }
}
