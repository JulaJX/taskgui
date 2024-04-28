import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DzialPracownikow {
    private int id;
    public String nazwa;
    static List<DzialPracownikow> listaDzialow = new ArrayList<>();


    @Override
    public String toString() {
        return "DzialPracownikow{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    public DzialPracownikow(String nazwa){
        this.nazwa = nazwa;
        Main.count++;
        this.id = Main.count;
    }

    public static DzialPracownikow createDzial(String nazwaDzialu) throws NotUniqueNameException {
        var dzial = new DzialPracownikow(nazwaDzialu);

        Optional<DzialPracownikow> czyIstnieje = listaDzialow.stream().filter(dzialp -> dzialp.nazwa.equals(nazwaDzialu)).findAny();

        if (czyIstnieje.isPresent()) {
            throw new NotUniqueNameException();
        }

        listaDzialow.add(dzial);

        return dzial;
    }

    public static void pracownicyWDziale(DzialPracownikow dzial){
        var pracownicy = Pracownik.listaPracownikow.stream().filter(pracownik -> pracownik.getDzial().equals(dzial));
        System.out.println("--------------");
        System.out.println(pracownicy.toList());
    }

}
