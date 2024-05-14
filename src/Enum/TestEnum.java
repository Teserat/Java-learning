package Enum;

public class TestEnum {


    public static void main(String[] args) {
        //WypiszDniTygodnia();
        //NumerDniaTygodnia(7);
        //WypiszPopularneStrony();
        //TopStrony.GAZETA.displayInfo();
        WebsiteInfo();



    }

    public static void WypiszDniTygodnia() {
        for (DniTygodnia day : DniTygodnia.values())
            System.out.println(day);
    }

    public static void NumerDniaTygodnia(int dayNumber) {
        int i = dayNumber;
        i--;
        System.out.println(DniTygodnia.values()[i]);
    }
    public static void WypiszPopularneStrony(){
        for (TopStrony website : TopStrony.values()) {
            System.out.printf("%s - %s%n", website.getName(), website.getUrl());
        }
    }
        public static void WebsiteInfo() {
            for (TopStrony site : TopStrony.values()) {
                site.displayInfo();
            }
        }

}

