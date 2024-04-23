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
        for(Map.Entry<Integer, Zadanie> entry : zadania.entrySet()){
            Zadanie zadanie = entry.getValue();

            if(zadanie.getStan() != Stan.UTWORZONE){
                System.out.println("Zadanie " + zadanie.getName()
                        + " nie może zostać rozpoczęte, ponieważ stan nie został utworzony");
                return;
            }

            if (!this.zespol.czyWszyscyZdrowi()) {
                System.out.println("Nie wszyscy pracownicy w zespole są zdrowi");
                return;
            }

            zadanie.start();
        }
    }
}
