package Funktionale_Programmierung.Streams.Uebungen;

public class Artikel {
    private int Nummer;
    private double Preis;
    private String warengruppe;
    private int lagebestand;

    public Artikel(int nummer, double preis, String warengruppe, int lagebestand) {
        this.Nummer = nummer;
        this.Preis = preis;
        this.warengruppe = warengruppe;
        this.lagebestand = lagebestand;
    }

    public int getNummer() {
        return Nummer;
    }

    public void setNummer(int nummer) {
        Nummer = nummer;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public String getWarengruppe() {
        return warengruppe;
    }

    public void setWarengruppe(String warengruppe) {
        this.warengruppe = warengruppe;
    }

    public int getLagebestand() {
        return lagebestand;
    }

    public void setLagebestand(int lagebestand) {
        this.lagebestand = lagebestand;
    }
}
