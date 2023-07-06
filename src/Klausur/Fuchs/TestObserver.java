package Klausur.Fuchs;

public class TestObserver {
    public static void main(String[] args) {
        Hase Hase = new Hase();
        new Fuchs(Hase);

        Hase.schlafen();
        Hase.fressen();
        Hase.bewegen();
    }
}
