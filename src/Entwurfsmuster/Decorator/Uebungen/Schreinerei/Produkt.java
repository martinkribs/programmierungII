package Entwurfsmuster.Decorator.Uebungen.Schreinerei;

public abstract class Produkt {
    public String description;
    public double price;

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }
}
