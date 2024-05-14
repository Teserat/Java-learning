package pliki;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("plik.txt");
        writer.write("Some text");
        writer.close();
    }
}
