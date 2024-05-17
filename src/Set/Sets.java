package Set;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("avocado");
        fruits.add("avocado "); //spacja, symulacja błędu zapisu

        System.out.println(fruits.size());
        System.out.println(fruits.contains("orange"));
        System.out.println(fruits.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");

        System.out.println(vege.size());
        vege.addAll(fruits); // dodanie owoców do warzyw
        System.out.println(vege.size());

        for (String vegetables : vege) {
            System.out.println(vegetables);
        }
    }
}
