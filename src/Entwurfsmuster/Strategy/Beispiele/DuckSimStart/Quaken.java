package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class Quaken implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
