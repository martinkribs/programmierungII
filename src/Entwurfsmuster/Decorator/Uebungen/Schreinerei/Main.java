package Entwurfsmuster.Decorator.Uebungen.Schreinerei;

public class Main {
    public static void main(String[] args) {
        Produkt Bett = new Bett();
        Decorator weissesBett = new Farbe(Bett);
        Decorator weissesDekoriertesBett = new Praegnierung(weissesBett);
        System.out.println(weissesDekoriertesBett.getDescription());
    }
}
