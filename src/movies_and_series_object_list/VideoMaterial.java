package movies_and_series_object_list;

public class VideoMaterial {
    int numer;
    String tytul;
    String platforma;
    int rok;
    String opis;
    double ocena;

    public VideoMaterial(int numer, String tytul, String platforma, int rok, String opis, double ocena) {
        this.numer = numer;
        this.tytul = tytul;
        this.platforma = platforma;
        this.rok = rok;
        this.opis = opis;
        this.ocena = ocena;
    }

    public VideoMaterial() {
    }

    //Setters
    public void setNumer(int numer) {
        this.numer = numer;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setPlatforma(String platforma) {
        this.platforma = platforma;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    // Getters
    public int getNumer() {
        return numer;
    }

    public String getTytul() {
        return tytul;
    }

    public String getPlatforma() {
        return platforma;
    }

    public int getRok() {
        return rok;
    }

    public String getOpis() {
        return opis;
    }

    public double getOcena() {
        return ocena;
    }





    @Override
    public String toString() {
        return "Numer: " + numer + ", Tytul: " + tytul + ", Platforma: " + platforma + ", Rok: " + rok + ", Opis: " + opis + ", Ocena: " + ocena;
    }

}
