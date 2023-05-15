package Entwurfsmuster.Strategy.Uebungen.Frog;

public class TestFrog {
    public static void main(String[] args) {
        Frog greenFrog = new Frog();
        greenFrog.setQuackType(new Loud());
        greenFrog.setJumpType(new High());
        greenFrog.quack();
        greenFrog.jump();
    }
}
