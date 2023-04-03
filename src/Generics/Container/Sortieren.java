package Generics.Container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortieren {
    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>();
        personList.add("Gunther");
        personList.add("Helene");
        personList.add("Fabienne");

        Collections.sort(personList);

        System.out.println(personList);

        personList.sort(Comparator.comparingInt(String::length));

        System.out.println(personList);
    }
}
