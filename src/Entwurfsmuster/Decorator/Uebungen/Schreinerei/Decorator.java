package Entwurfsmuster.Decorator.Uebungen.Schreinerei;

public abstract class Decorator extends Produkt{
    Produkt produkt;

    public Decorator(Produkt produkt) {
        this.produkt = produkt;
    }

    @Override
    public double getPrice() {
        return this.produkt.getPrice() + this.price;
    }

    @Override
    public String getDescription() {
        return this.produkt.getDescription() + ", " + this.description;
    }
}
