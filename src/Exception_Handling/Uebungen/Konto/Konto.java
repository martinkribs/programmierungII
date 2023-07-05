package Exception_Handling.Uebungen.Konto;

public class Konto {
    private int kontonummer;
    private double saldo;

    public Konto() {
    }

    public Konto(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Konto(int kontonummer, double saldo) throws KontoAusnahme {
        if (saldo < 0)
            // todo
            this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public int getKontonummer() {
        return this.kontonummer;
    }

    public void setKontonummer(int nr) {
        this.kontonummer = nr;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double betrag) throws KontoAusnahme {
        this.saldo = betrag;
    }

    public void zahleEin(double betrag) throws KontoAusnahme {
        this.saldo += betrag;
    }

    public void zahleAus(double betrag) throws KontoAusnahme {
        this.saldo -= betrag;
    }

    public void info() {
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }
}
