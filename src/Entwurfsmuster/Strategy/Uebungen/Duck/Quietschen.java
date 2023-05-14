package Entwurfsmuster.Strategy.Uebungen.Duck;

public class Quietschen implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
