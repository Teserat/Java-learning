import interface_animal_polymorphism.Zoo;
import extra_methods.ExtraMethods;
import vehicle_interface.Bike;

public class Main {

    public static void main(String[] args) {

        // Update Package with 2 new switch cases
        // Paczka z metodą prywatną w interfejsie interface_calculator_private_method
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

        // Paczka tablice

        //----------Klasa Warjacje w paczce the_basics
        //Warjacje.testMatematyczny1(); // skaner z zapytaniem o wynik 4 x 5 - zast. if skrócony
        //Warjacje.testMatematyczny2(); // skaner z zapytaniem o wynik 4 x 5 - zast. try catch z exception na inny znak niż liczba
        //Warjacje.WykonaniePentliOkreslonaIloscRazy(20);  // praca z "if" odmienne zachowania dla przekazania : 0, minusowych int, dodatnich int, inne niż int
    }


}
