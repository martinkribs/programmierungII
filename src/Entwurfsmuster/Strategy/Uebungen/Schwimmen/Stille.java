package Entwurfsmuster.Strategy.Uebungen.Schwimmen;

public class Stille implements Quackable {

    @Override
    public void quack() {
        System.out.println("...");
    }
    
}
