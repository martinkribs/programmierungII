package Generics.Container;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Nachtrag {
    public static void main(String[] args) {

        Set<Klasse> numbers = new TreeSet<>();
        Random random = new Random();

        while (numbers.size() < 6) {
            int n = random.nextInt(49)+1;
            Klasse klasse = new Klasse(n);
            numbers.add(klasse);
        }
        for (Klasse o : numbers) {
            System.out.println(o.getId());
        }
        //make equal
        System.out.println("Make all equal: ");
        for (Klasse o : numbers) {
            o.setId(1);
        }
        // output
        for (Klasse o : numbers) {
            System.out.println(o.getId());
        }

    }
}
