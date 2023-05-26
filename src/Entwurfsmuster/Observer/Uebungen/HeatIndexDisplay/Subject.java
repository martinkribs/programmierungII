package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

public interface Subject {
    void registerDisplay(Observer display);
    void deleteDisplay(Observer display);
    void informDisplays();
}
