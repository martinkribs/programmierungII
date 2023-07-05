package Entwurfsmuster.Observer.Beispiele.WeatherStation;

public interface Observer {
	void update(float temp, float humidity, float pressure);
}
