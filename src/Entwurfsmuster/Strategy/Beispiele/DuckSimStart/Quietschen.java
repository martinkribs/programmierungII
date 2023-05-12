package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class Quietschen implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}
