package Entwurfsmuster.Observer.Uebungen;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setWeather(0, 0, 0);
    }
}
