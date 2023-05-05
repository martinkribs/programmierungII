package Funktionale_Programmierung.Streams.Uebungen;

import java.util.List;

public class PersonList {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Gunther"), new Person("Anna"), new Person("Peter"));
        Object[] sortedNames = persons.stream()
                .map(x -> x.getName().toUpperCase())
                .sorted()
                .toArray();
        for (Object name : sortedNames) {
            System.out.println(name);
        }
    }
}
