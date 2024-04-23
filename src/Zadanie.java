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
        this.dataUtworzenia = LocalDateTime.now();
    }

    @Override
    public void run() {
        this.stan = Stan.ROZPOCZETE;
        System.out.println("Wykonywanie zadania zostało rozpoczęte");

        for (int i = 0; i < this.czasWykonania; i++) {
            System.out.println("Mineło: " + i + " sekund od rozpoczęcia zadania");
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        System.out.println("Zadanie zostało wykorzystane");
        this.dataZakonczenia = LocalDateTime.now();
        this.stan = Stan.ZAKONCZONE;
    }
}
