package Entwurfsmuster.Strategy.Uebungen.Fliegen;

public class Stille implements Quackable {

    @Override
    public void quack() {
        System.out.println("...");
    }
    
}
