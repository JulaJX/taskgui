import java.time.LocalDateTime;
import java.util.Random;

public class Zadanie extends Thread {
    private String nazwa;
    private String opis;
    private Stan stan;
    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataZakonczenia;
    private int czasWykonania = new Random().nextInt((8 - 3) + 3);




//    nie ma pola zatwierdzenie chodzi o stan nie?
    public Zadanie(String nazwa, String opis, Stan stan) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.stan = stan;
    }
    public Zadanie(String nazwa) {
        this.nazwa = nazwa;
        this.opis = "";
        this.stan = Stan.UTWORZONE;
    }

    @Override
    public void run() {
        super.run();
    }
}
