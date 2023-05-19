package Entwurfsmuster.Observer.Beispiele;

public class Forscher implements Beobachter {

    private String name;

    private Pinguin pingu;

    public Forscher(Pinguin pingu, String name) {
        this.name = name;
        this.pingu = pingu;
        pingu.registriereBeobachter(this);
    }

    @Override
    public void aktualisiere() {
        System.out.println(this.name + " sieht dem Pinguin zu. Dieser " + this.pingu.getAktion() + ".");
    }
}
