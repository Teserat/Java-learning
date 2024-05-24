package txt_file_operations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner myReader = new Scanner(file);
        while (myReader.hasNext()) {  //<- czy posiada następną linię, jak nie to koniec
            String line = myReader.nextLine(); // <- jeśli tak to pobierz następną linię
            System.out.println(line); // <- wypisz linię
        }
        myReader.close();

    }
}
