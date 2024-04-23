import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager extends Recepcjonista {
    private List<Zespol> hisotriaZespolow = new ArrayList<>();
    private List<String> historiaZadan = new ArrayList<>();

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
