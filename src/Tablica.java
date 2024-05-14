public class Tablica {

    static String[] tablica = new String[10];
    static int count = 0;

    public static void tablica() {
        tablica[0] = "test";
        count++;
    }

    public static void zapisDoTablicy(String wartosc) {
        tablica[count] = wartosc;
        count++;
    }

    public static void odczytTablicy() {
        for (int i = 0; i <= tablica.length - 1; i++)
            if (tablica[i] != null) {
                System.out.println(tablica[i]);
            }
    }


}
