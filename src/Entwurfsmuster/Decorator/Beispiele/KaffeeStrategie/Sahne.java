package Entwurfsmuster.Decorator.Beispiele.KaffeeStrategie;

public class Sahne implements Zutat {

    public Sahne() {
    }

    @Override
    public double getPreis() {
        return 0.420;
    }

    @Override
    public String getBeschreibung() {
        return ", Sahne, echt lecker";
    }
}