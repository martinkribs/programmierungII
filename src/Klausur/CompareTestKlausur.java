package Klausur;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTestKlausur {

    public static void main(String[] args) {
        String[] strings = {"werkstoffkunde", "elektrotechnik", "germanistik", "theaterwissenschaften", "physik", "altorientalistik"};

        Comparator<String> comp = (x, y) -> x.length() - y.length();
        Arrays.sort(strings, comp);// sortiere nach Laenge
        showArray(strings);

        comp = (x, y) -> x.compareTo(y);
        Arrays.sort(strings, comp); // sortiere nach Alphabet
        showArray(strings);

        comp = (x, y) -> countEsStream(x)-countEsStream(y);
        Arrays.sort(strings, comp);//sortiere nach Anzahl des Buchstabens e
        showArray(strings);
    }

    private static <T> void showArray(T[] arr) {
        System.out.println("--- ");
        System.out.println(Arrays.toString(arr));
    }

    private static int countEsStream(String s) {
        long result = s.chars().filter(c -> c == 'e' || c == 'E').count();
        return (int) result;
    }
}