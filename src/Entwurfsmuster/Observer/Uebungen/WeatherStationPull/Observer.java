package Entwurfsmuster.Observer.Uebungen.WeatherStationPull;

public interface Observer {
    void measurementChanged(float temperature, float humidity, float pressure);
}
