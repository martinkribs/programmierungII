package Entwurfsmuster.Observer.Uebungen.WeatherStationPush;

public interface Subject {
    void registerDisplay(Observer display);
    void deleteDisplay(Observer display);
    void informDisplays();
}
