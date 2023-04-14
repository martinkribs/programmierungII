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

        Comparator<String> comp = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()<o2.length()){
                    return -1;
                } else if(o1.length()== o2.length()){
                    return 0;
                } else {
                    return 1;
                }
            } 
        };

        personList.sort(comp);

        System.out.println(personList);
    }
}
