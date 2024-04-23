import java.util.*;

class Main {
    static List<DzialPracownikow> listaDzialow = new ArrayList<>();

    public static void main(String args[]) {
        try {
            Recepcjonista pracownik1 = new Recepcjonista("Juliusz","Jakobik", new Date(2003, 3, 3),createDzial("Recepcja"));
            Trener pracownik2 = new Trener("Krzysztof","Kolenda", new Date(2010, 3, 3),createDzial("Sala gimnastyczna"),"Siatkówka");
            Recepcjonista pracownik3 = new Recepcjonista("Konrad","Frydryk", new Date(2003, 3, 3),createDzial("Recepcja 2 piętro"));

            List<Pracownik> pracownicy = Arrays.asList(pracownik1, pracownik2, pracownik3);

            Zespol zespol = new Zespol(
                    "Strefa czyszcząca",
                    new Manager("Wadim", "Miller", new Date(2003, 3, 3), createDzial("Porządek")),
                    pracownicy
            );

            System.out.println(zespol);
        } catch (NotUniqueNameException notUniqueNameException) {
            notUniqueNameException.printStackTrace();
        }

    }


    private static DzialPracownikow createDzial(String nazwaDzialu) throws NotUniqueNameException {
        var dzial = new DzialPracownikow(nazwaDzialu);

        Optional<DzialPracownikow> czyIstnieje = listaDzialow.stream().filter(dzialp -> dzialp.nazwa.equals(nazwaDzialu)).findAny();

        if (czyIstnieje.isPresent()) {
            throw new NotUniqueNameException();
        }

        listaDzialow.add(dzial);

        return dzial;
    }
}

