package Entwurfsmuster.Strategy.Uebungen.Duck;

public class Stille implements Quackable {

    @Override
    public void quack() {
        System.out.println("...");
    }
    
}
