package Klausur.Fuchs;

public class Fuchs implements Beobachter {

    private Hase Hase;

    public Fuchs(Hase Hase) {
        this.Hase = Hase;
        Hase.registriereBeobachter(this);
    }

    @Override
    public void aktualisiere() {
        System.out.println("Der Fuchs sieht dem Hasen zu. Dieser " + this.Hase.getAktion() + ".");
    }
}
