package Entwurfsmuster.Decorator.Uebungen.Schreinerei;

public class Praegnierung extends Decorator{
    public Praegnierung(Produkt produkt) {
        super(produkt);
        this.price = 50;
        this.description = "prägniert";
    }
}
