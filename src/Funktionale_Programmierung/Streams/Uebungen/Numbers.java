package Funktionale_Programmierung.Streams.Uebungen;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 3 };
        IntStream numberStream = Arrays.stream(numbers);
        System.out.println(numberStream);
        /*
        Object[] sortedSingleNumbers = numberStream.stream()
                .sorted()
                .distinct();
                .toArray();
        System.out.println(Arrays.toString(sortedSingleNumbers));
        */
    }
}
