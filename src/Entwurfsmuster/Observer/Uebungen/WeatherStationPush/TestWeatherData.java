package Entwurfsmuster.Observer.Uebungen.WeatherStationPush;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.registerDisplay(new Display("1"));
        weatherStation.registerDisplay(new Display("2"));
        weatherStation.setWeather(10, 50, 10);
    }
}
