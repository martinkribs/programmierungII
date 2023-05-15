package Entwurfsmuster.Strategy.Uebungen.Fliegen;

public class Raketenantrieb implements Flyable{
    @Override
    public void fly() {
        System.out.println("Fly super fast");
    }
}
