package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestTermin {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.MONTH, 4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.YEAR, 2);

        Termin[] Termine = new Termin[] {
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
        System.out.println("Und was ist in München?");
        System.out.println();
        printTermine(Termine, (x) -> Objects.equals(x.getOrt(), "München"));
        System.out.println("_______________________");
    }

    public static void printTermine(Termin[] termine, Predicate<Termin> kriterium) {
        List<Termin> termin = Arrays.stream(termine).filter(kriterium).collect(Collectors.toList());
        Object[] Termine = termin.toArray();
        for (int i = 0; i < Termine.length; i++) {
            System.out.println(Termine[i]);
        }
    }
}
