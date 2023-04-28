package Funktionale_Programmierung.Lambda_Ausdruecke.Uebungen;

import java.util.Calendar;

public class Termin {
    private String beschreibung;
    private String ort;
    private Calendar zeit;

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Calendar getZeit() {
        return zeit;
    }

    public void setZeit(Calendar zeit) {
        this.zeit = zeit;
    }

    public Termin(String beschreibung, String ort, Calendar zeit) {
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeit = zeit;
    }

    @Override
    public String toString() {
        return "Was? " + this.beschreibung + ", Wo? " + this.ort + ", Wann? " + this.zeit.getTime();
    }
}
