package map;

import extra_methods.ExtraMethods;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Basia");
        students.put(2, "Bobek");
        students.put(3, "Basia");
        students.put(4, "Tomek");

        System.out.println(students.get(1));
        System.out.println(students.containsKey(4));
        System.out.println(students.containsValue("Robert"));
        System.out.println(students.size());
        students.remove(1);
        System.out.println(students.get(1));
        System.out.println(students.size());

        ExtraMethods.linia("Wylistowanie kluczy");

        //odwołanie do kluczy (klucz zawsze jest unikalny, i zapisanie na nim powoduje nadpisanie)
        for(Integer key : students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        ExtraMethods.linia("Drugi  raz petla po wartościach (niezauwazalne co chodzi o kolejność)");
        //odwołanie do wartości (wartości może być wiele takich samych przypisanych do różnych kluczy)
        for (String student : students.values()){
            System.out.println(student);
        }

    }
}
