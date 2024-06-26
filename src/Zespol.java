import java.util.ArrayList;
import java.util.List;

public class Zespol {
    private int id;
    private String nazwa;
    private Manager manager;
    private List<Pracownik> listaPracownikow;

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "Zespol{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", manager=" + manager +
                ", listaPracownikow=" + listaPracownikow +
                '}';
    }

    public Zespol(String nazwa, Manager manager, List<Pracownik> listaPracownikow) {
        this.nazwa = nazwa;
        this.manager = manager;
        this.listaPracownikow = listaPracownikow;
        this.manager.hisotriaZespolow.add(this);
        Main.count++;
        this.id = Main.count;
    }

    public void dodajPracownikow(Pracownik pracownik){
        if (pracownik instanceof Manager) return;

        this.listaPracownikow.add(pracownik);
    }
    public void dodajPracownikow( List<Pracownik> listaPracownikow){
        //  Funkcja lambda sprawdza czy pracownik jest instancja klasy Manager
        //  pracownik -> pracownik instanceof Manager
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
