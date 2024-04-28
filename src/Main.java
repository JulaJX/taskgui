import java.util.*;

class Main {
    public static int count = 0;

    public static void main(String args[]) {
        try {
            var recepcja = DzialPracownikow.createDzial("Recepcja");

            Recepcjonista pracownik1 = new Recepcjonista("Juliusz","Jakobik", new Date(2003, 3, 3), recepcja);
            Recepcjonista kopia_pracownik1 = new Recepcjonista("Juliusz","Jakobik", new Date(2003, 3, 3), recepcja);
            Recepcjonista recepcjosnita2 = new Recepcjonista("Kordian","Galiński", new Date(2003, 3, 3), recepcja);
            Trener pracownik2 = new Trener("Krzysztof","Kolenda", new Date(2010, 3, 3),DzialPracownikow.createDzial("Sala gimnastyczna"),"Siatkówka");
            Recepcjonista pracownik3 = new Recepcjonista("Konrad","Frydryk", new Date(2003, 3, 3),DzialPracownikow.createDzial("Recepcja 2 piętro"));

            List<Pracownik> pracownicy = Arrays.asList(pracownik1, pracownik2, pracownik3);

            Zespol zespol = new Zespol(
                    "Strefa czyszcząca",
                    new Manager("Wadim", "Miller", new Date(2003, 3, 3), DzialPracownikow.createDzial("Porządek")),
                    pracownicy
            );

            DzialPracownikow.pracownicyWDziale(recepcja);

            Praca hotel = new Praca("Utrzymanie porządku w budynku",zespol);

            Zadanie zad1 = new Zadanie("Sprzątanie 1-piętra");
            zad1.setZatwierdzone(true);
            Zadanie zad2 = new Zadanie("Czyszczenie garażu");
            zad2.setZatwierdzone(true);
            Zadanie zad3 = new Zadanie("Obieg higieny kuchni");

            hotel.dodajZadanie(1, zad1);
            hotel.dodajZadanie(2, zad2);
            hotel.dodajZadanie(3, zad3);

            hotel.run();

            System.out.println(pracownik1.imiePracownikaOdTylu());

            System.out.println(pracownik1.compareTo(recepcjosnita2));
            System.out.println(pracownik1.compareTo(kopia_pracownik1));

        } catch (NotUniqueNameException notUniqueNameException) {
            notUniqueNameException.printStackTrace();
        }

    }




}

