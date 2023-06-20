package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus1;

public class Milch implements Zutat {
    private double preis = 0.10;
    private String description = ", mit Milch, keks.de";

    public Milch() {
    }

    @Override
    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String getBeschreibung() {
        return description;
    }
}