package Klausur;

import java.util.HashMap;

public class Personendaten {
    public static void main(String[] args) {
        HashMap<String, Double> Personendaten = new HashMap<>();
        Personendaten.put("Attila", 2.15);
        Personendaten.put("Marie", 1.62);
        Personendaten.put("Colin", 0.68);
        Personendaten.put("Thekla", 1.81);
        Personendaten.put("Richard", 1.62);

        System.out.println(Personendaten.containsKey("Marie"));
        System.out.println(Personendaten.containsKey("James"));

        System.out.println(Personendaten.get("Thekla"));

    }
}
