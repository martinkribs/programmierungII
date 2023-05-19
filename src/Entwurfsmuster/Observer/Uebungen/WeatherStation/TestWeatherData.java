package Entwurfsmuster.Observer.Uebungen.WeatherStation;

public class TestWeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        new Display(weatherStation,"1");
        new Display(weatherStation,"2");
        weatherStation.setWeather(10, 50, 10);
    }
}
