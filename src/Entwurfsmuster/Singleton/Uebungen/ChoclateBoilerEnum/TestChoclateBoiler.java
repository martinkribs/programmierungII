package Entwurfsmuster.Singleton.Uebungen.ChoclateBoilerEnum;

public class TestChoclateBoiler {
    public static void main(String[] args) {
        ChocolateBoilerStart chocolateBoiler = ChocolateBoilerStart.INSTANCE;
        chocolateBoiler.boil();
        chocolateBoiler.fill();
        ChocolateBoilerStart anotherButSame = ChocolateBoilerStart.INSTANCE;
        anotherButSame.boil();
    }
}
