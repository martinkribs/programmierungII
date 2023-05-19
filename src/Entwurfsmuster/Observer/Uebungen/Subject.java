package Entwurfsmuster.Observer.Uebungen;

public interface Subject {
    void registerDisplay(Observer display);
    void deleteDisplay(Observer display);
    void informDisplays();
}
