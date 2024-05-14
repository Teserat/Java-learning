import java.util.Scanner;

public class Warjacje {


    public static void testMatematyczny2() {
        Scanner scanner = new Scanner(System.in);
        final String powitanie = "Hej, czy wiesz ile to jest 5 x 8?";
        final String potwierdzenie = "Dobry wynik!";
        final String niestety = "Niepoprawny wynik, spróbuj jeszcze raz.";
        final int oczekiwanyWynik = 40;
        int odpowiedz = 0;

        System.out.println(powitanie);

        while (true) {
            try {
                String number = scanner.nextLine();
                odpowiedz = Integer.parseInt(number);

                if (odpowiedz == oczekiwanyWynik) {
                    System.out.println(potwierdzenie);
                    break; // Wyjdź z pętli, jeśli odpowiedź jest poprawna
                } else {
                    System.out.println(niestety);
                }
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba. Spróbuj jeszcze raz.");
            }
        }
    }


    public static void testMatematyczny1() {
        Scanner scanner = new Scanner(System.in);
        String powitanie = "Hej, czy wiesz ile to jest 5 x 8?";
        String potwierdzenie = "Dobry wynik";
        String niestety = "niepoprawny wynik";
        int oczekiwanyWynik = 40;

        System.out.println(powitanie);
        String number = scanner.nextLine();
        int odpowiedz = Integer.parseInt(number);
        //skrócony if
        System.out.println(odpowiedz == oczekiwanyWynik ? potwierdzenie : niestety);





        /* //------rozwinięty if
        if (odpowiedz == 40) {
            System.out.println(potwierdzenie);
        } else {
            System.out.println(niestety);
        }
        */

        /* //------bez parsowania String na int
        if (number.equals("40")) {
            System.out.println(potwierdzenie);
        } else {
            System.out.println(niestety);
        }
        */

    }


    public static void HelloPentla(int count) {

        int num = 0;

        if (count == 0) {
            System.out.println("Tosz to zero");
        } else if (count < 0) {
            System.out.println("wpisana wartosc \"" + count + "\" jest na minusie");
        } else if (count > 0) {
            do {
                System.out.println("Hello po raz " + ++num);
            } while (num != count);
            System.out.println("Stop z tym wariactwem!!");
        } else {
            System.out.println("Coś ty wpisał, no bo chyba nie liczbe");
        }
    }
}
