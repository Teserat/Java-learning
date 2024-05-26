package movies_and_series_object_list;

//Konstruktor dziedziczący po MaterialReview
public class SeriesReview extends MaterialReview{

    public SeriesReview(int numer, String tytul, String platforma, int rok, String opis, double ocena){
        super(numer, tytul, platforma, rok, opis,ocena);
    }
}
