package Entwurfsmuster.Observer.Uebungen.Pinguin;

import java.util.ArrayList;

public class Pinguin implements Subjekt {

    private String aktion;

    private ArrayList<Beobachter> observer = new ArrayList<Beobachter>();

    public String getAktion() {
        return this.aktion;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
        benachrichtigeBeobachter();
    }

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.observer.add(beobachter);
    }

    @Override
    public void entferneBeobachter(Beobachter beobachter) {
        this.observer.remove(beobachter);
    }

    @Override
    public void benachrichtigeBeobachter() {
        for(Beobachter beobachter : this.observer){
            beobachter.aktualisiere();
        }
    }

}
