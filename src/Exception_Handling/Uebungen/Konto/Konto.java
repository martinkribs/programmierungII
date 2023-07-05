package Exception_Handling.Uebungen.Konto;

public class Konto {
    private int kontonummer;
    private double saldo;

    public Konto() {
    }

    public Konto(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public Konto(int kontonummer, double saldo) throws KontoAusnahme, KontoNummerAusnahme {
        if (saldo < 0) {
            throw new KontoAusnahme("Sie können kein verschuldetes Konto eröffnen");
        }
        if (kontonummer < 0) {
            throw new KontoNummerAusnahme();
        }
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
        if (betrag < 0) {
            throw new KontoAusnahme("Sie können Ihre Salgo nicht negativ setzen");
        }
        this.saldo = betrag;
    }

    public void zahleEin(double betrag) throws KontoAusnahme {
        if (betrag < 0) {
            throw new KontoAusnahme("Sie können keinen negativen Beitrag einzahlen");
        }
        this.saldo += betrag;
    }

    public void zahleAus(double betrag) throws KontoAusnahme {
        if (betrag < 0 || betrag > this.saldo) {
            throw new KontoAusnahme("Sie können keinen negativen Beitrag auszahlen");
        }
        this.saldo -= betrag;
    }

    public void info() {
        System.out.println("Kontonummer: " + kontonummer + " Saldo: " + saldo);
    }
}
