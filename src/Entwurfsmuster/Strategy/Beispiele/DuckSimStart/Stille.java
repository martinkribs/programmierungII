package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class Stille implements Quackable {

    @Override
    public void quack() {
        System.out.println("...");
    }
    
}
