package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import Funktionale_Programmierung.Lambda_Ausdruecke.Beispiele.Z;

public class LambdasImplementing {
    public static void main(String[] args) {
        Z test = ((x) -> {
            return x == 'b';
        });
        calcZ(test, 'a');
    }

    private static void calcZ(Z z, char i) {
        System.out.println(z.methodOfZ(i));
    }
}
