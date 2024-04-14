import java.util.ArrayList;
import java.util.List;

class Main {
    List<DzialPracownikow> listaDzialow = new ArrayList<>();

    public static void main(String args[]) {

    }


    private static DzialPracownikow createDzial(String nazwaDzialu, List<DzialPracownikow> listaDzialow) throws NotUniqueNameException {
//        int dzial = listaDzialow.stream().findFirst(dzial -> dzial.nazwa == nazwaDzialu);

        return new DzialPracownikow(nazwaDzialu);
    }
}

