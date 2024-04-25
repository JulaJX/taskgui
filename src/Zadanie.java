import java.time.LocalDateTime;
import java.util.Random;

public class Zadanie extends Thread {
    private String nazwa;
    private String opis;
    private Stan stan;
    private LocalDateTime dataUtworzenia;
    private LocalDateTime dataZakonczenia;
    private int czasWykonania = new Random().nextInt((8 - 3) + 3);

    public Stan getStan() {
        return this.stan;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                ", stan=" + stan +
                ", dataUtworzenia=" + dataUtworzenia +
                ", dataZakonczenia=" + dataZakonczenia +
                ", czasWykonania=" + czasWykonania +
                '}';
    }

    public Zadanie(String nazwa, String opis, Stan stan) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.stan = stan;
        this.dataUtworzenia = LocalDateTime.now();
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
        System.out.println("Wykonywanie Zadania "+this.nazwa+": zostało ROZPOCZĘTE");

        for (int i = 0; i < this.czasWykonania; i++) {
            System.out.println("Zadanie " + this.nazwa +": Mineło: " + i + " sekund od rozpoczęcia zadania");
            try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        System.out.println("Zadanie " + this.nazwa +": zostało wykorzystane");
        this.dataZakonczenia = LocalDateTime.now();
        this.stan = Stan.ZAKONCZONE;
    }
}
