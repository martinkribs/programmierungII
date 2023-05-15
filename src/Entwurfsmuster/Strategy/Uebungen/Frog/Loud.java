package Entwurfsmuster.Strategy.Uebungen.Frog;

public class Loud implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quacking loud");
    }
}
