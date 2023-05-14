package Entwurfsmuster.Strategy.Uebungen.Duck;

public class Quaken implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
