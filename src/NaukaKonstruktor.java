public class NaukaKonstruktor {

    public String imie;
    public String login;
    public String haslo;

    //ciakawostka, domyślny konstruktor sam się tworzy jak go nie zapiszemy
    NaukaKonstruktor() {
        imie = "Jan";
        login = "dummy";
        haslo = "1234";
    }

    NaukaKonstruktor(String imie, String login, String haslo) {
        this.imie = imie;
        this.login = login;
        this.haslo = haslo;
    }
}
