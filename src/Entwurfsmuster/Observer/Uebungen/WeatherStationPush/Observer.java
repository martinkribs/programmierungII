package Entwurfsmuster.Observer.Uebungen.WeatherStationPush;

public interface Observer {
    void measurementChanged(float temperature, float humidity, float pressure);
}
