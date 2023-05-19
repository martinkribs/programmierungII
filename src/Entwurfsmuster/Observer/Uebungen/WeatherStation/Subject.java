package Entwurfsmuster.Observer.Uebungen.WeatherStation;

public interface Subject {
    void registerDisplay(Observer display);
    void deleteDisplay(Observer display);
    void informDisplays();
}
