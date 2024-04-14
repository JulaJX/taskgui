import java.util.Date;

public class Trener extends Pracownik{
    private String specjalizacja;

    public Trener(String imie, String nazwisko, Date dataUrodzenia, DzialPracownikow dzial, String specjalizacja) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.specjalizacja = specjalizacja;
    }
}
