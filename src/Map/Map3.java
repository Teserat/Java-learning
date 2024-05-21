package Map;

import Paczka.Pomocnicza.ExtraMethods;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

    // Zliczanie powtarzających się elementów z
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 23, 4, 5, 6, 4, 5, 7, 8, 5, 3, 5};
        liczWystąpienia(numbers);
        ExtraMethods.linia("-");


    }

    // Wyliczenie powtarzających się wystąpień
    public static void liczWystąpienia(int[] tab) {
        Map<Integer, Integer> wystapienia = new HashMap<>();
        for (int i = 0; i < tab.length; i++) {
            if (wystapienia.containsKey(tab[i])) {
                Integer value = wystapienia.get(tab[i]);
                wystapienia.put(tab[i], value + 1);
            } else {
                wystapienia.put(tab[i], 1);
            }
        }
        for (Integer klucz : wystapienia.keySet()) {
            System.out.println("Liczba " + klucz + " wystepuje " + wystapienia.get(klucz));
        }
    }
}