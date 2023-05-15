package Entwurfsmuster.Strategy.Uebungen.Schwimmen;

public class Calm implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Swim calm");
    }
}
