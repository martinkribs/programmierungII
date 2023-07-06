package Klausur;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class ArtikelListe {
    public static void main(String[] args) {
        List<Artikel> Lager = List.of(new Artikel(1,'A',3.0),new Artikel(3,'B',1.0), new Artikel(2,'B',2.0));
        Lager.stream().sorted((x,y)->x.getId()-y.getId()).toList().forEach(System.out::println);
        Lager.stream().sorted(Comparator.comparingDouble(Artikel::getPreis).reversed()).toList().forEach(System.out::println);
        System.out.println(Lager.stream().filter(article -> article.getTyp() == 'a').count());
        List<Artikel> BLager = Lager.stream().filter(article -> article.getTyp() == 'B').toList();
        OptionalDouble averagePrice = Lager.stream().mapToDouble(Artikel::getPreis).average();
    }
}
