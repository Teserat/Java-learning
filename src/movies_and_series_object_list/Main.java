package movies_and_series_object_list;

import extra_methods.ExtraMethods;

public class Main {

    public static void main(String[] args) {
        VideoMaterial test = new VideoMaterial(1,"Conan", null, 1982, "Fajny film", 6.7);
        System.out.println(test);
        test.ocena = 4; // przypisanie bezpośrednie
        VideoMaterial test2 = new VideoMaterial();

        test2.setNumer(2); // przypisanie z użycem settera <- Użycie setterów pozwala zachować enkapsulację, dodawać logikę walidacji i jest bardziej elastyczne w przypadku zmian w strukturze klasy.
        test2.setTytul("Tokyo Light Up");
        test2.setPlatforma("Disney+");
        test2.setRok(2003);
        test2.setOpis("fake");
        test2.setOcena(0);
        System.out.println(test2);
        ExtraMethods.linia("Zakonczenie testy metody nadrzednej");


    }


}
