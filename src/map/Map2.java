package map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        // Tworzenie nowego HashMap
        Map<String, Integer> phoneBook = new HashMap<>();

        // Dodawanie elementów do mapy
        phoneBook.put("Alice", 123456789);
        phoneBook.put("Bob", 987654321);
        phoneBook.put("Charlie", 555666777);

        // Odczytywanie wartości z mapy
        Integer aliceNumber = phoneBook.get("Alice");
        System.out.println("Alice's number: " + aliceNumber);

        // Sprawdzanie, czy klucz istnieje
        if (phoneBook.containsKey("Bob")) {
            System.out.println("Bob's number: " + phoneBook.get("Bob"));
        }

        // Iterowanie przez elementy mapy
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            Integer number = entry.getValue();
            System.out.println(name + ": " + number);
        }

        // Usuwanie elementu z mapy
        phoneBook.remove("Charlie");

        // Rozmiar mapy
        System.out.println("Rozmiar ksiazki telefonicznej: " + phoneBook.size());
    }
}