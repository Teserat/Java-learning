package enum_example;

public enum TopStrony {
    GOOGLE("Google", "https://www.google.pl"),
    ONET("Onet", "https://www.onet.pl"),
    WP("Wirtualna Polska", "https://www.wp.pl"),
    INTERIA("Interia", "https://www.interia.pl"),
    ALLEGRO("Allegro", "https://www.allegro.pl"),
    O2("O2", "https://www.o2.pl"),
    GAZETA("Gazeta", "https://www.gazeta.pl"),
    FACEBOOK("Facebook", "https://www.facebook.com"),
    NASZA_KLASA("Nasza Klasa", "https://nk.pl"),
    YOUTUBE("YouTube", "https://www.youtube.com");

    private final String name; // Nazwa pola wyświetlana
    private final String url;  // Adres pola URL

    TopStrony(String name, String url) {
        this.name = name;
        this.url = url;
    }
    // Metoda zwracająca nazwę strony
    public String getName() {
        return name;
    }

    // Metoda zwracająca adres URL strony
    public String getUrl() {
        return url;
    }

    // Metoda do wyświetlenia informacji o stronie
    public void displayInfo() {
        System.out.println(name + " - " + url);
    }

}
