package Klausur;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        Random random = new Random();

        System.out.println("Ziehung der Lottozahlen - 6 aus 49");
        while (numbers.size() < 7) {
            int n = random.nextInt(49)+1;
            numbers.add(n);
        }
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
