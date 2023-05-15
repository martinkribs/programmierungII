package Entwurfsmuster.Strategy.Uebungen.Frog;

public class Frog implements Jumpable, Quackable{

    private Jumpable jumpType;

    private Quackable quackType;

    public void setJumpType(Jumpable jumpType) {
        this.jumpType = jumpType;
    }

    public void setQuackType(Quackable quackType) {
        this.quackType = quackType;
    }

    @Override
    public void jump() {
        this.jumpType.jump();
    }

    @Override
    public void quack() {
        this.quackType.quack();
    }
}
