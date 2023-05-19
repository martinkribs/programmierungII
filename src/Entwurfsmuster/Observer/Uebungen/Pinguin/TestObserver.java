package Entwurfsmuster.Observer.Uebungen.Pinguin;

public class TestObserver {
    public static void main(String[] args) {
        Pinguin pingu = new Pinguin();
        new Forscher(pingu, "Hans");
        new Forscher(pingu, "Peter");

        pingu.setAktion("schwimmt");
        pingu.setAktion("watschelt");
    }
}
