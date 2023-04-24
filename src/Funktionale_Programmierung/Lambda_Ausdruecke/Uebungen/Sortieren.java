package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import java.util.Arrays;

public class Sortieren {
    public static void main(String[] args) {
        String[] array = new String[]{
                "aaaa", "bb", "ccc", "d"
        };
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, (x, y) -> x.length() - y.length());
        System.out.println(Arrays.toString(array));
    }
}
