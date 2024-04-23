import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class Pracownik implements Comparable<Pracownik>{

    private static List<Pracownik> listaPracownikow = new ArrayList<>();

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", dzial=" + dzial +
                ", czyZdrowy=" + czyZdrowy +
                '}';
    }

    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private DzialPracownikow dzial;
    private boolean czyZdrowy = true;



    public Pracownik(String imie, String nazwisko, Date dataUrodzenia, DzialPracownikow dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.dzial = dzial;
        listaPracownikow.add(this);
    }

    // Settery i gettery

    public boolean isCzyZdrowy() {
        return this.czyZdrowy;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }

    //Sprawdza imie i nazwisko jesli imie nie jest takie samo to nawet nie dochodzi do sprawdzania nazwiska
    @Override
    public int compareTo(Pracownik innyPracownik) {
        int porownywaneImie = this.imie.compareTo(innyPracownik.imie);
        if(porownywaneImie != 0){
            return porownywaneImie;
        }
        return this.nazwisko.compareTo(innyPracownik.nazwisko);
    }


}
