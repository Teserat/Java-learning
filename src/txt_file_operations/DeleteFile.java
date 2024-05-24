package txt_file_operations;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("plik.txt");

        if(file.delete()){ //<--zwraca wartość logiczną więc można sprawdzić czy istnieje plik czy nie
            System.out.println("Plik usunięty");
        }else{
            System.out.println("nie znaleziono pliku");
        }
    }
}
