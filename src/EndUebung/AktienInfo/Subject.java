package EndUebung.AktienInfo;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}