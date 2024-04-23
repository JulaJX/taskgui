import java.util.Date;

public class Recepcjonista extends Pracownik {
    private String login, haslo;
    private String inicjaly;


    public Recepcjonista(String imie, String nazwisko, Date dataUrodzenia, DzialPracownikow dzial) {
        super(imie, nazwisko, dataUrodzenia, dzial);
        this.login = login;
        this.haslo = haslo;
        this.inicjaly =  "" + imie.charAt(0) + nazwisko.charAt(0);
    }

    @Override
    public String toString() {
        return "Recepcjonista{" +
                "login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", inicjaly='" + inicjaly + '\'' +
                '}';
    }

    @Override
    public void setImie(String imie) {
        super.setImie(imie);
        this.inicjaly =  "" + imie.charAt(0) + this.getNazwisko().charAt(0);
    }

    @Override
    public void setNazwisko(String nazwisko) {
        super.setNazwisko(nazwisko);
        this.inicjaly =  "" + this.getImie().charAt(0) + nazwisko.charAt(0);
    }
}
