package list;
import Paczka.Pomocnicza.ExtraMethods;
import Paczka.Pomocnicza.FirstNameGenerator;
import Paczka.Pomocnicza.NameGenerator;

import java.util.ArrayList;
import java.util.List;


public class FirstList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        ExtraMethods.linia("poczatek testow listy");
        System.out.println("rozmiar listy : " + names.size()); //0
        System.out.println("czy lista zawiera pozycje " + !names.isEmpty());
        System.out.println("dodanie osob do listy");
        names.add("Pawel");
        names.add("Dorota");
        names.add("Jadzia");
        names.add("Pawel");
        System.out.println("rozmiar listy : " + names.size()); //4
        System.out.println("czy lista zawiera pozycje " + !names.isEmpty());
        System.out.println("pozycja Doroty na liscie : " + names.indexOf("Dorota")); //1
        System.out.println("pozycja osoby z numerem 3 na liscie to : " +names.get(3)); // Pawel
        System.out.println("czy lista zawiera osobe o imieniu Jadzia : " + names.contains("Jadzia"));//true
        System.out.println("Czy lista zawiera osobe o imieniu Rebeka : " + names.contains("Rebeka"));//false
        ExtraMethods.linia("zapisanie listy w liscie");
        List<String>test = new ArrayList<>();
        System.out.println(test.isEmpty());
        test.addAll(names);
        System.out.println(test.isEmpty());
        ExtraMethods.linia("interowanie nowej listy");
        for(int i=0; i < test.size(); i++){
            System.out.println(test.get(i));
        }
        ExtraMethods.linia("lista z obiektami");
        List<Osoba> osoby = new ArrayList<>();
        System.out.println("Czy lista obiektow studenci jest pusta : " + osoby.isEmpty());
        osoby.add(new Osoba("Tom", "Hardy"));
        osoby.add(new Osoba("John", "Hardy"));
        osoby.add(new Osoba("Tim", "Hardy"));
        osoby.add(new Osoba("Luffy", "Monkey"));
        System.out.println("Czy obiekty do listy studentow dodane : " + !osoby.isEmpty());
        ExtraMethods.linia("wypisanie listy studentow");
        for( Osoba stu : osoby){
            System.out.println(stu.imie + " " + stu.nazwisko);
        }
        ExtraMethods.linia("generowanie losowych osob na liscie");
        System.out.println("Liczba  imion : 4946, przykladowe imie : " + FirstNameGenerator.gFirstName());
        System.out.println("Liczba  nazwisk : 6520, przykldowe nazwisko : " + NameGenerator.gName());
        int licznik = 7;
        ExtraMethods.linia("generowanie listy z osobami poprzez petle, liczba osob w liscie : " + licznik + " ");
        List<Osoba> wygenerowaneOsoby = new ArrayList<>();
        for(int i =0 ; i < licznik; i++){
            wygenerowaneOsoby.add(new Osoba(FirstNameGenerator.gFirstName(),NameGenerator.gName()));
            System.out.println( i+1 + " " + wygenerowaneOsoby.get(i).imie + " " + wygenerowaneOsoby.get(i).nazwisko );
        }
        ExtraMethods.linia("usuniecie 2 osoby i ponowne wylistowanie listy");
        licznik = 0;
        wygenerowaneOsoby.size();
        wygenerowaneOsoby.remove(1);
        for( Osoba wyg1 : wygenerowaneOsoby){
            System.out.println( licznik+1 + " " + wygenerowaneOsoby.get(licznik).imie + " " + wygenerowaneOsoby.get(licznik).nazwisko );
           ++licznik;
        }


    }



}

