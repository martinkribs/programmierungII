package Entwurfsmuster.Decorator.Beispiele.KaffeeStrategie;

public class Schoko implements Zutat {

    public Schoko() {
    }

    @Override
    public String getBeschreibung() {
        return "kauf bei REWE!, mit schokolade, baumschulenversand24.de";
    }

    @Override
    public double getPreis() {
        return 0.25;
    }
}
