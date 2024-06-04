package arrays;

import extra_methods.ExtraMethods;

import java.util.Random;

public class Main {
    //Tablice


    public static void main(String[] args) {

        //code switch On/OFF
        if(false) {
            String[] strings = new String[3];
            strings[0] = "jeden";
            strings[1] = "dwa";
            strings[2] = "trzy";
            System.out.println("arrays.Tablica : lista 1--------------");
            System.out.println("dlugosc listy = " + strings.length);
            for (int i = 0; i <= 2; i++) {
                System.out.println(strings[i]);
            }

            System.out.println("arrays.Tablica : lista 2--------------");
            arrays.Tablica.odczytTablicy(); // odczyt tablicy
            arrays.Tablica.tablica(); // inicjalizacja z metody
            arrays.Tablica.odczytTablicy(); // ponowny odczyt tablicy
            arrays.Tablica.zapisDoTablicy("nowa wartosc");
            arrays.Tablica.odczytTablicy(); // ponowny odczyt tablicy
        }
        ExtraMethods.linia("Tests of Anime Array list");

        AnimeListArray BestAnimeList = new AnimeListArray();
        BestAnimeList.AnimeListSize();
        ExtraMethods.linia("Random anime from list");
        Random random = new Random();
        BestAnimeList.Anime( random.nextInt(120));










    }


}
