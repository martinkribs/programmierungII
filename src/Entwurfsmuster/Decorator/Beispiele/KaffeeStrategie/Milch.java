package Entwurfsmuster.Decorator.Beispiele.KaffeeStrategie;

public class Milch implements Zutat {

    public Milch() {
    }

    @Override
    public double getPreis() {
        return 0.10;
    }

    @Override
    public String getBeschreibung() {
        return ", mit Milch, keks.de";
    }
}