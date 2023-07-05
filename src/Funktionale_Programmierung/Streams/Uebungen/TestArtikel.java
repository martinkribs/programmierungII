package Funktionale_Programmierung.Streams.Uebungen;

import java.util.List;
import java.util.function.Predicate;

public class TestArtikel {

    public static void main(String[] args) {

        List<Artikel> Lager = List.of(new Artikel(1, 12.98, "Obst", 5), new Artikel(2, 31.20, "Reinigung", 3),
                new Artikel(3, 65.34, "Schmuck", 1));
        Predicate<Artikel> kriterium = (x) -> ((x.getWarengruppe().equals("Obst")) && (x.getLagebestand() > 2));
        Lager = Lager.stream().filter(kriterium).toList();
        Lager.forEach(System.out::println);

    }
}
