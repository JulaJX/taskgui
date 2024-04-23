import java.util.ArrayList;
import java.util.List;

public class Zespol {
    private String nazwa;
    private Manager manager;
    private List<Pracownik> listaPracownikow;

    @Override
    public String toString() {
        return "Zespol{" +
                "nazwa='" + nazwa + '\'' +
                ", manager=" + manager +
                ", listaPracownikow=" + listaPracownikow +
                '}';
    }

    public Zespol(String nazwa, Manager manager, List<Pracownik> listaPracownikow) {
        this.nazwa = nazwa;
        this.manager = manager;
        this.listaPracownikow = listaPracownikow;
    }
    public void dodajPracownikow(Pracownik pracownik){
        if (pracownik instanceof Manager) return;

        this.listaPracownikow.add(pracownik);
    }
    public void dodajPracownikow( List<Pracownik> listaPracownikow){
        //  Funkcja lambda sprawdza czy pracownik jest instancja klasy Manager
        //    pracownik -> pracownik instanceof Manager
        listaPracownikow = listaPracownikow.stream().filter(pracownik -> pracownik instanceof Manager).toList();
        this.listaPracownikow.addAll(listaPracownikow);
    }

    public boolean czyWszyscyZdrowi() {
        for (Pracownik pracownik : listaPracownikow) {
            if(!pracownik.isCzyZdrowy()) {
                return false;
            }
        }

        return true;
    }
}
