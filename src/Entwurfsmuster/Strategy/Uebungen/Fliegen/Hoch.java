package Entwurfsmuster.Strategy.Uebungen.Fliegen;

public class Hoch implements Flyable {

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
    
}
