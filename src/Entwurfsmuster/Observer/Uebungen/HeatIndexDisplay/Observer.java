package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

public interface Observer {
    void measurementChanged(float temperature, float humidity, float pressure);
}
