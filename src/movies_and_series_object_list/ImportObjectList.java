package movies_and_series_object_list;

import java.util.List;
import java.util.Set;

public class ImportObjectList {
    public static void ImportData(List<FilmReview> listaFilmow, Set<String> zebraneFilmy, List<SeriesReview> listaSeriali, Set<String> zebraneSeriale) {

        dodajFilm(listaFilmow, zebraneFilmy, 1, "Maestro", "Netflix", 2023, "Dramat biograficzny o Leonardzie Bernsteinie.", 4.5);
        dodajFilm(listaFilmow, zebraneFilmy, 2, "Nimona", "Netflix", 2023, "Animowany film cyberpunkowy o buntowniczce zmieniającej kształty.", 4.2);
        dodajFilm(listaFilmow, zebraneFilmy, 3, "They Cloned Tyrone", "Netflix", 2023, "Sci-fi komedia kryminalna o spisku związanym z klonowaniem.", 4.0);
        dodajFilm(listaFilmow, zebraneFilmy, 4, "Polite Society", "Amazon Prime", 2023, "Komedia akcji o młodej dziewczynie próbującej powstrzymać ślub swojej siostry.", 3.8);
        dodajFilm(listaFilmow, zebraneFilmy, 5, "Rohan at the Louvre", "Amazon Prime", 2023, "Adaptacja mangi 'Jojo’s Bizarre Adventure' z nadprzyrodzoną tajemnicą.", 3.9);
        dodajFilm(listaFilmow, zebraneFilmy, 6, "The Taste of Things", "Rotten Tomatoes", 2023, "Francuski dramat o gotowaniu i miłości.", 4.5);
        dodajFilm(listaFilmow, zebraneFilmy, 7, "Shayda", "Rotten Tomatoes", 2023, "Dramat o irańskiej matce w australijskim domu dla kobiet.", 4.4);
        dodajFilm(listaFilmow, zebraneFilmy, 8, "The Teachers' Lounge", "Rotten Tomatoes", 2023, "Thriller o nauczycielce w nowej szkole.", 4.3);
        dodajFilm(listaFilmow, zebraneFilmy, 9, "Aloners", "Rotten Tomatoes", 2021, "Dramat o izolacji, przedstawiający życie pracowniczki call center.", 4.1);
        dodajFilm(listaFilmow, zebraneFilmy, 10, "The Innocent", "Rotten Tomatoes", 2022, "Komedia kryminalna o mężczyźnie chroniącym swoją matkę.", 4.0);
        dodajFilm(listaFilmow, zebraneFilmy, 11, "Saltburn", "Amazon Prime", 2023, "Psychologiczny thriller i satyra społeczna.", 4.2);
        dodajFilm(listaFilmow, zebraneFilmy, 12, "A Thousand and One", "Amazon Prime", 2023, "Dramat społeczny o kobiecie odbudowującej więzi z synem.", 4.3);
        dodajFilm(listaFilmow, zebraneFilmy, 13, "Rustin", "Netflix", 2023, "Biograficzny dramat o działaczu na rzecz praw obywatelskich.", 4.4);
        dodajFilm(listaFilmow, zebraneFilmy, 14, "The Deepest Breath", "Netflix", 2023, "Dokument o freedivingu.", 4.2);
        dodajFilm(listaFilmow, zebraneFilmy, 15, "Fair Play", "Netflix", 2023, "Dramat o korporacyjnej chciwości i polityce płci.", 4.1);
        dodajFilm(listaFilmow, zebraneFilmy, 16, "Indiana Jones and the Dial of Destiny", "Disney+", 2023, "Kontynuacja przygód legendarnego archeologa.", 4.0);
        dodajFilm(listaFilmow, zebraneFilmy, 17, "The Little Mermaid", "Disney+", 2023, "Adaptacja live-action klasycznej animacji Disneya.", 3.9);
        dodajFilm(listaFilmow, zebraneFilmy, 18, "World's Best", "Disney+", 2023, "Inspirujący dramat o młodym chłopcu marzącym o zostaniu raperem.", 4.1);
        dodajFilm(listaFilmow, zebraneFilmy, 19, "No One Will Save You", "Hulu / Disney+", 2023, "Sci-fi thriller o samotnej kobiecie walczącej z inwazją kosmitów.", 4.2);
        dodajFilm(listaFilmow, zebraneFilmy, 20, "Quiz Lady", "Hulu", 2023, "Komedia o dwóch siostrach próbujących wygrać w teleturnieju.", 4.0);
        dodajFilm(listaFilmow, zebraneFilmy, 21, "Leo", "Netflix", 2023, "Animowana komedia z Adamem Sandlerem i Billem Burrem.", 3.8);
        dodajFilm(listaFilmow, zebraneFilmy, 22, "The Wonderful Story of Henry Sugar", "Netflix", 2023, "Zbiór czterech krótkich filmów w reżyserii Wesa Andersona.", 4.3);
        dodajFilm(listaFilmow, zebraneFilmy, 23, "The Wonderful Story of Henry Sugar", "Netflix", 2023, "Zbiór czterech krótkich filmów w reżyserii Wesa Andersona.", 4.3);
        dodajSerial(listaSeriali, zebraneSeriale, 1, "Scott Pilgrim Takes Off", "Netflix", 2023, "Animowana adaptacja komiksu 'Scott Pilgrim vs. The World'.", 4.6);
        dodajSerial(listaSeriali, zebraneSeriale, 2, "The Marvelous Mrs. Maisel S5", "Amazon Prime", 2023, "Piąty sezon serialu o stand-up komiku w latach 50. i 60.", 4.7);
        dodajSerial(listaSeriali, zebraneSeriale, 3, "Our Flag Means Death", "HBO Max", 2023, "Komediowy serial o arystokracie, który zostaje piratem.", 4.3);
        dodajSerial(listaSeriali, zebraneSeriale, 4, "The Last of Us", "HBO Max", 2023, "Adaptacja gry wideo o przetrwaniu w postapokaliptycznym świecie.", 4.8);
        dodajSerial(listaSeriali, zebraneSeriale, 5, "Shrinking", "Apple TV+", 2023, "Komediodramat o terapeucie łamiącym zasady etyki zawodowej.", 4.5);
        dodajSerial(listaSeriali, zebraneSeriale, 6, "The Man in the High Castle", "Amazon Prime", 2015, "Alternatywna historia, gdzie naziści wygrali II wojnę światową.", 4.0);
        dodajSerial(listaSeriali, zebraneSeriale, 7, "Carnival Row", "Amazon Prime", 2019, "Fantastyczny serial kryminalny o faeryjskiej uchodźczyni i detektywie.", 4.1);
        dodajSerial(listaSeriali, zebraneSeriale, 8, "Hanna", "Amazon Prime", 2019, "Serial o młodej zabójczyni wychowanej przez ojca.", 4.2);
        dodajSerial(listaSeriali, zebraneSeriale, 9, "The Wheel of Time", "Amazon Prime", 2021, "Adaptacja serii książek fantasy Roberta Jordana.", 4.3);
        dodajSerial(listaSeriali, zebraneSeriale, 10, "Star Trek: Picard", "Amazon Prime", 2020, "Powrót Patricka Stewarta jako Jean-Luc Picard w nowym rozdziale uniwersum Star Trek.", 4.4);
        dodajSerial(listaSeriali, zebraneSeriale, 11, "Invincible", "Amazon Prime", 2021, "Animowany serial o superbohaterach.", 4.3);
        dodajSerial(listaSeriali, zebraneSeriale, 12, "Outer Range", "Amazon Prime", 2022, "Sci-fi thriller o rancherze odkrywającym tajemnicze zjawiska na swojej ziemi.", 4.0);
        dodajSerial(listaSeriali, zebraneSeriale, 13, "The Tick", "Amazon Prime", 2016, "Superbohaterska parodia.", 4.1);
        dodajSerial(listaSeriali, zebraneSeriale, 14, "The Peripheral", "Amazon Prime", 2022, "Adaptacja powieści Williama Gibsona.", 4.0);
        dodajSerial(listaSeriali, zebraneSeriale, 15, "Only Murders in the Building (Sezon 3)", "Hulu", 2023, "Trzeci sezon kryminalnej komedii o podcaście true crime.", 4.5);
        dodajSerial(listaSeriali, zebraneSeriale, 16, "The Bear (Sezon 2)", "Hulu", 2023, "Dramat o kucharzu powracającym do Chicago, aby zarządzać rodzinną restauracją.", 4.6);
        dodajSerial(listaSeriali, zebraneSeriale, 17, "Beef", "Netflix", 2023, "Komediowy dramat o konflikcie między dwoma osobami po incydencie drogowym.", 4.4);
        dodajSerial(listaSeriali, zebraneSeriale, 18, "Heartstopper", "Netflix", 2023, "Drugi sezon romantycznej komedii o dojrzewaniu i miłości między dwoma chłopcami.", 4.7);
    }
    private static void dodajFilm(List<FilmReview> listaFilmow, Set<String> zebraneFilmy, int numer, String tytul, String platforma, int rok, String opis, double ocena) {
        if (!zebraneFilmy.contains(tytul)) {
            listaFilmow.add(new FilmReview(numer, tytul, platforma, rok, opis, ocena));
            zebraneFilmy.add(tytul);
        }
    }

    private static void dodajSerial(List<SeriesReview> listaSeriali, Set<String> zebraneSeriale, int numer, String tytul, String platforma, int rok, String opis, double ocena) {
        if (!zebraneSeriale.contains(tytul)) {
            listaSeriali.add(new SeriesReview(numer, tytul, platforma, rok, opis, ocena));
            zebraneSeriale.add(tytul);
        }
    }
}
