package Funktionale_Programmierung.Streams.Uebungen;

import java.util.Arrays;
import java.util.function.Predicate;

public class TestArtikel {
    public static void main(String[] args) {
        Artikel[] Lager = new Artikel[]{
                new Artikel(1, 12.98, "Obst", 5),
                new Artikel(2, 31.20, "Reinigung", 3),
                new Artikel(3, 65.34, "Schmuck", 1)
        };
        filter(Lager, ((x) -> {
            return true;
        }));
    }

    public static void filter(Artikel[] Lager, Predicate<Artikel> kriterium) {
        System.out.println(Arrays.stream(Lager).filter(kriterium));
    }
}
