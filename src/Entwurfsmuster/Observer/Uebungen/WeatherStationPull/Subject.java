package Entwurfsmuster.Observer.Uebungen.WeatherStationPull;

public interface Subject {
    void registerDisplay(Observer display);
    void deleteDisplay(Observer display);
    void informDisplays();
}
