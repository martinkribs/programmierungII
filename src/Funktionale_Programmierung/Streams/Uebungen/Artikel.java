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

    public double getPreis() {
        return Preis;
    }


    public String getWarengruppe() {
        return warengruppe;
    }

    public int getLagebestand() {
        return lagebestand;
    }

    @Override
    public String toString() {
        return "Artikelnummer: " + this.Nummer + " der Warengruppe: " + this.warengruppe + " hat den Preis: " + this.Preis + " und ist noch " + this.lagebestand + " mal da.";
    }
}
