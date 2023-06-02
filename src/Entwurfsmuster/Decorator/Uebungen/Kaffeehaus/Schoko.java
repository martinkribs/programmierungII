package Entwurfsmuster.Decorator.Uebungen.Kaffeehaus;

public class Schoko implements Zutat {
    private double preis = 0.25;
    private String description = "kauf bei REWE!, mit schokolade, baumschulenversand24.de";

    public Schoko() {
    }

    @Override
    public String getBeschreibung() {
        return this.description;
    }

    @Override
    public double getPreis() {
        return this.preis;
    }
}
