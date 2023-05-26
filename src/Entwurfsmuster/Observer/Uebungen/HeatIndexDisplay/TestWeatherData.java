package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerDisplay(new Display("1"));
        weatherStation.registerDisplay(new Display("2"));
        weatherStation.registerDisplay(new HeatIndexDisplay("HeatIndex"));
        weatherStation.setWeather(10, 50, 10);
    }
}
