package txt_file_operations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File ("plik.txt");
        if(file.createNewFile()){ // <- sprawdza w sam sobie czy jest plik, zwraca wartość bool
            System.out.println("Stworzyłem nowy plik");
        }else {
            System.out.println("Plik już istnieje");
        }
    }
}
