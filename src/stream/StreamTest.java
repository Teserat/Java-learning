package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        // tworzenie listy, nie jest to jeszcze strumień (
        List<String> names = Arrays.asList("Tomek", "Janek", "Franek", "Mariusz");

        //utworzenie strumienia z String, Tablicy, Double, Int
        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3, 5, 7, 8, 4, 1, 5, 5);
        IntStream intStream = IntStream.range(1, 100);

        //Przetwarzanie danych
        //filtr - filtrowanie
        //map - zmiana elementu na coś innego
        // limit - zwraca określoną liczbę elementów
        // peek - pozwala na przeprowadzenie operacji na każdym elemencie

        //kończenie strumienia
        //foreach - wywołanie akcji dla każdego elementu strumienia
        //count - zwróci ilość elementów w strumieniu
        // allMatch - sprawdzenie czy elementy spełniają jakiś warunek
        // collect - zwraca nowy typ na podstawie strumienia


        //przekazujemy elment przy użyciu lambdy, będziemy filtrować czy imie zaczyna się od slowa T, zostaną w strumieniu tylko zaczynające się na literę T
        //potem zwiększamy rozmiat, operacja  foreach  wypisuje na ekranie element

//        streamNames.filter(el -> el.startsWith("T"))
//                .map(el -> el.toUpperCase() )
//                .forEach(el -> System.out.println(el));

        // szukamy elementó większych od 20 po czym mnozymy przez 2, limitujemy na 10 elementów do pokazania
//
//        intStream.filter(el -> el>20)
//                .map(el -> el*2)
//                .limit(10)
//                .forEach(el -> System.out.println(el));

        //Druga opcja zwrócenie wartości w long count
//        long count = intStream.filter(el -> el>20)
//                .map(el -> el*2)
//                .limit(10)
//                .count();
//
//        System.out.println(count);

        //Przypisanie do zmiennej string
        List<String> modifiedNames =
                streamNames.filter(el -> el.startsWith("T"))
                        .map(el -> el.toUpperCase())
                        .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());

    }

}
