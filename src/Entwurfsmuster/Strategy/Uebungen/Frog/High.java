package Entwurfsmuster.Strategy.Uebungen.Frog;

public class High implements Jumpable{
    @Override
    public void jump() {
        System.out.println("Jumping high");
    }
}
