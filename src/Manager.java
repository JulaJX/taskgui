import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Manager extends Recepcjonista {
    public List<Zespol> hisotriaZespolow = new ArrayList<>();
    public List<Zadanie> historiaZadan = new ArrayList<>();

    public Manager(String imie, String nazwisko, Date dataUrodzenia, DzialPracownikow dzial) {
        super(imie, nazwisko, dataUrodzenia, dzial);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "hisotriaZespolow=" + hisotriaZespolow +
                ", historiaZadan=" + historiaZadan +
                '}';
    }
}
