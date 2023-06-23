package Entwurfsmuster.Singleton.Uebungen.ChoclateBoilerInstance;

public class TestChoclateBoiler {
    public static void main(String[] args) {
        ChocolateBoilerStart chocolateBoiler = ChocolateBoilerStart.getInstance();
        chocolateBoiler.boil();
        chocolateBoiler.fill();
        ChocolateBoilerStart anotherButSame = ChocolateBoilerStart.getInstance();
        anotherButSame.boil();
    }
}
