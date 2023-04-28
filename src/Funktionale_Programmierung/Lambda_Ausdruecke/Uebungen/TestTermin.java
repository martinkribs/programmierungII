package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import java.util.function.Predicate;

public class TestTermin {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.MONTH, 4);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.YEAR, 2);

        Termin[] Termine = new Termin[]{
                new Termin("Food Festival", "Bodensee", calendar),
                new Termin("Oktoberfest", "München", calendar1),
                new Termin("Fusion", "Berlin", calendar2)
        };
        for (Termin datum : Termine) {
            System.out.println(datum);
        }
        printTermine(Termine, (x) -> Objects.equals(x.getOrt(), "München"));
    }

    public static void printTermine(Termin[] termine, Predicate<Termin> kriterium) {
        System.out.println(Arrays.stream(termine).filter(kriterium));
    }
}
