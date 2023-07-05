package EndUebung.AktienInfoStudents;

public interface Aktie {
    void addObserver(Observer ob);
    void setPrice(double price);
    double getPreis();
}
