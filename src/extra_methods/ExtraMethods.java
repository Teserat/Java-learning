package extra_methods;

public class ExtraMethods {
    public static void linia(String tresc) {
        String kreska = "-";
        int maxLenght = tresc.length();
        maxLenght =  155 - maxLenght;
        int ileRazy = maxLenght;
        String wynik = kreska.repeat(ileRazy);

        System.out.println("------ " + tresc + " " +wynik);
    }
}
