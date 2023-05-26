package Entwurfsmuster.Observer.Uebungen.WeatherStation;

public interface Observer {
    void measurementChanged(float temperature, float humidity, float pressure);
}
