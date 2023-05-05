package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import java.util.*;
import java.util.function.Predicate;

public class TestTermin {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.MONTH, 4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.MONTH, 2);

        Termin[] Termine = new Termin[]{
                new Termin("Food Festival", "Bodensee", calendar),
                new Termin("Oktoberfest", "München", calendar1),
                new Termin("Fusion", "Berlin", calendar2)
        };
        System.out.println("_______________________");
        System.out.println("Was geht?");
        System.out.println();
        for (Termin datum : Termine) {
            System.out.println(datum);
        }
        System.out.println("_______________________");
        System.out.println("Sortiert?");
        System.out.println();
        for (Termin datum : Termine) {
            System.out.println(datum);
        }
        System.out.println();
        sortTermine(Termine, Comparator.comparing(Termin::getZeit));
        System.out.println("_______________________");
        System.out.println("Und was ist in München?");
        System.out.println();
        printTermine(Termine, (x) -> Objects.equals(x.getOrt(), "München"));
        System.out.println("_______________________");
    }

    public static void printTermine(Termin[] termine, Predicate<Termin> kriterium) {
        Object[] Termine = Arrays.stream(termine).filter(kriterium).toArray();
        for (Object o : Termine) {
            System.out.println(o);
        }
    }

    public static void sortTermine(Termin[] termine, Comparator<Termin> kriterium) {
        Arrays.sort(termine, kriterium);
    }
}
