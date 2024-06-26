package Entwurfsmuster.Observer.Beispiele.WeatherStation;

public class TestWeather {

	public TestWeather() {
		// :)
	}

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		Observer ccd = new CurrentConditionsDisplay();
		Observer fd = new ForecastDisplay();
		Observer sd = new StatisticsDisplay();
		wd.registerObserver(ccd);
		wd.registerObserver(fd);
		wd.registerObserver(sd);
		wd.setMeasurement(26.3f, 63.2f, 1.032f);
		System.out.println("--------------------------------------------------");
		wd.setMeasurement(22.3f, 63.2f, 1.038f);
		System.out.println("--------------------------------------------------");
		wd.setMeasurement(22.3f, 63.2f, 1.1f);
		System.out.println("--------------------------------------------------");
		wd.setMeasurement(22.3f, 63.2f, 1.0f);
		System.out.println("--------------------------------------------------");
		wd.setMeasurement(22.3f, 63.2f, 1.3f);
	}
}