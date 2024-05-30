import animal_polymorphism.Zoo;
import extra_methods.ExtraMethods;
import vehicle_interface.Bike;

public class Main {

    public static void main(String[] args) {


        // Paczka z generowaniem danych csv_generator
        // movies and series objkect - projekt z obiektami recenzji, dziedziczeniem, dodaniem na liste i blokadą deduplikacji
        //------------------------------------------------

        // paczka loops - dodanie metody na wykrycie czy wyraz to palindrom, dodatkowo Fibonaccci i FirstNumbers
        // Dodanie Paczek Sets i Map oraz izolacja użytecznych metod w Paczce pomocniczej

        // Pczka list zawiera zagadnienia związane z listą
        // Paczka stream - zawiera naukę strumieni
        // Paczka z lambdą - zawiera też przedstawienie klasy anonimowej

        // Paczka z enumem
        // Paczka z dodawaniem i usuwaniem plików

        //Wyjątki - do odpalenia w paczce wyjątki, wyjątek polegający na braku ścieżki do pliku + tworzenie plików tekstowych

        //Polimorfizm - przypisanie do Interfejsu nadżędnego, podżędnych metod - czyli wielopostaciowość
        Zoo.Zoo(null);

        // TODO: 23.05.2024 opisać lepiej poniższe nauki
        // rozważyć lepsze poznanie TODO

        ExtraMethods.linia("Praca z interfejsami w paczce Pojazd.Interfejs");
        // Interfejs - rower posiada interfejs narzucony przez Vechicle i BicycleEquipment
        Bike romet = new Bike();
        romet.jazda(0);
        romet.frontBicycleLight();

        //Konstruktor użytkownika imie/login/hasło

        NaukaKonstruktor user1 = new NaukaKonstruktor();
        NaukaKonstruktor user2 = new NaukaKonstruktor("Sylwia", "stokrotka", "stokrotka123");
        NaukaKonstruktor user3 = new NaukaKonstruktor("Michal", "sad", "wielki");

        for (int i = 0; i < 3; i++) {
            NaukaKonstruktor[] Tablica = new NaukaKonstruktor[]{user1, user2, user3};
            NaukaKonstruktor temp = Tablica[i];
            System.out.println("Uzytkownik " + i);
            System.out.println("Imie : " + temp.imie);
            System.out.println("Login : " + temp.login);
            System.out.println("Haslo : " + temp.haslo);

        }

        /* //Tablice
        String[]strings = new String[3];
        strings[0] = "jeden";
        strings[1] = "dwa";
        strings[2] = "trzy";
        System.out.println("Tablica : lista 1--------------");
        System.out.println("dlugosc listy = " + strings.length);
        for (int i = 0; i <= 2; i++)
        {
            System.out.println(strings[i]);
        }

        System.out.println("Tablica : lista 2--------------");
        Tablica.odczytTablicy(); // odczyt tablicy
        Tablica.tablica(); // inicjalizacja z metody
        Tablica.odczytTablicy(); // ponowny odczyt tablicy
        Tablica.zapisDoTablicy("nowa wartosc");
        Tablica.odczytTablicy(); // ponowny odczyt tablicy
        */
        //----------Klasa Warjacje w paczce the_basics
        //Warjacje.testMatematyczny1(); // skaner z zapytaniem o wynik 4 x 5 - zast. if skrócony
        //Warjacje.testMatematyczny2(); // skaner z zapytaniem o wynik 4 x 5 - zast. try catch z exception na inny znak niż liczba
        //Warjacje.WykonaniePentliOkreslonaIloscRazy(20);  // praca z "if" odmienne zachowania dla przekazania : 0, minusowych int, dodatnich int, inne niż int
    }


}
