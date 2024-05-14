package Wyjatek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Wyjatek { // <- wywołanie tej metody wywołuje wyjątek, ale kod się skompiluje. Gdyż obsłużyliśmy wyjątek jaki może zaistnieć
//dodanie do nazwy metody że wyżuca wyjątek
    public static void main(String[]args) throws FileNotFoundException{
        readFile("src\\Wyjatek\\ttest.txt");
    }


    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
