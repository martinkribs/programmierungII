package Klausur.Fuchs;

import java.util.ArrayList;

public class Hase implements Subjekt {

    private String aktion;

    private ArrayList<Beobachter> observer = new ArrayList<>();

    public String getAktion() {
        return this.aktion;
    }

    public void bewegen() {
        this.aktion = "bewegt sich";
        benachrichtigeBeobachter();
    }

    public void schlafen() {
        this.aktion = "schläft";
    }

    public void fressen() {
        this.aktion = "frisst";
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
