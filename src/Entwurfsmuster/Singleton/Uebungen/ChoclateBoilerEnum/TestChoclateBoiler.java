package Entwurfsmuster.Singleton.Uebungen.ChoclateBoilerEnum;

public class TestChoclateBoiler {
    public static void main(String[] args) {
        ChocolateBoilerStart chocolateBoiler = ChocolateBoilerStart.UNIQUE_INSTANCE;
        chocolateBoiler.boil();
        chocolateBoiler.fill();
        ChocolateBoilerStart anotherButSame = ChocolateBoilerStart.UNIQUE_INSTANCE;
        anotherButSame.boil();
    }
}
