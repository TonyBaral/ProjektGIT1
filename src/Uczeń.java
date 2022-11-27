public class Uczeń extends Person {

    String klasa;
    String ocena;

    public String getKlasa() {
        return klasa;
    }

    public String getOcena() {
        return ocena;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public void setOcena(String ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Uczeń{" +
                "klasa='" + klasa + '\'' +
                ", ocena='" + ocena + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    public Uczeń(String imie, String nazwisko, String klasa, String ocena) {
        super(imie, nazwisko);
        this.klasa = klasa;
        this.ocena = ocena;

    }
}

