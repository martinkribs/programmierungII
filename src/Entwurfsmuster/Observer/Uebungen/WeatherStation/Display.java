package Entwurfsmuster.Observer.Uebungen.WeatherStation;

public class Display implements Observer{

    WeatherStation weatherStation;

    String name;

    public Display(WeatherStation weatherStation, String name){
        this.weatherStation = weatherStation;
        this.name = name;
        weatherStation.registerDisplay(this);
    }

    @Override
    public void measurementChanged() {
        System.out.println("_______________________________________");
        System.out.println("Wetterstation: " +this.name);
        System.out.println("Temperatur: "+ weatherStation.getTemperature());
        System.out.println("Feuchtigkeit: "+ weatherStation.getHumidity());
        System.out.println("Druck: "+ weatherStation.getPressure());
        System.out.println("_______________________________________");
    }
    
}
