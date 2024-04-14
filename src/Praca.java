import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Praca implements Runnable {
    public static Map<Integer, Praca> listaZadan = new HashMap<>();
    public static Praca pobierzPracePoID(int id) {
        return listaZadan.get(id);
    }

    private Collection<Zadanie> zadania;
    private String opis;
    private Zespol zespol;



    @Override
    public void run() {

    }
}
