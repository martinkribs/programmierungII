package Entwurfsmuster.Decorator.Uebungen.Schreinerei;

public class Farbe extends Decorator{
    public Farbe(Produkt produkt) {
        super(produkt);
        this.price = 20;
        this.description = "farbig";
    }
}
