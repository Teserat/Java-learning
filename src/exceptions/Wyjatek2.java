package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Wyjatek2 {

    public static void main(String[]args){
        try {
            readFile("src\\Wyjatek\\ttest.txt");  // on/off wyjątek zaleznie czy dobrze zaadresujemy nazwę pliku txt
        } catch (FileNotFoundException e) {
            System.out.println("Wystapil wyjatek");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        finally {
            System.out.println("close file");
        }
    }


    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}