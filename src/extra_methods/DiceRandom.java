package extra_methods;

import java.util.Random;

public class DiceRandom {
    public static void main(String[] args) {
        //  instancja klasy Random
        Random random = new Random();
        // rzut kostką
        int diceRoll = rollDice(random);
        // wynik rzutu kostką
        System.out.println("Wynik rzutu kostka: " + diceRoll);
    }

    // Metoda do rzutu kostką
    public static int rollDice(Random random) {
        // Kostka ma 6 ścianek, więc losujemy liczbę od 1 do 6
        return random.nextInt(6) + 1;
    }
}
