public class NaukaKonstruktor {

    public String imie;
    public String login;
    public String haslo;

    NaukaKonstruktor(){
        imie = "Jan";
        login = "dummy";
        haslo = "1234";
    }

    NaukaKonstruktor(String imie, String login, String haslo)
    {
        this.imie = imie;
        this.login = login;
        this.haslo = haslo;
    };


}
