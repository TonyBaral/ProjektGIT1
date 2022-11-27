public class Nauczyciel extends Person{
    String opis;
    String specjalizacja;

    public String getOpis() {
        return opis;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public Nauczyciel(String imie, String nazwisko, String opis, String specjalizacja) {
        super(imie, nazwisko);
        this.opis = opis;
        this.specjalizacja = specjalizacja;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "opis='" + opis + '\'' +
                ", specjalizacja='" + specjalizacja + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
