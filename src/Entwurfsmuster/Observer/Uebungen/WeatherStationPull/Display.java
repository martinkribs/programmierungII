package Entwurfsmuster.Observer.Uebungen.WeatherStationPull;

public class Display implements Observer{

    String name;

    WeatherStation weatherStation;

    public Display(WeatherStation weatherStation ,String name){
        this.name = name;
        this.weatherStation = weatherStation;
        this.weatherStation.registerDisplay(this);
    }

    @Override
    public void measurementChanged(float temperature, float humidity, float pressure) {
        System.out.println("_______________________________________");
        System.out.println("Wetterstation: " +this.name);
        System.out.println("Temperatur: "+ this.weatherStation.getTemperature());
        System.out.println("Feuchtigkeit: "+ this.weatherStation.getHumidity());
        System.out.println("Druck: "+ this.weatherStation.getPressure());
        System.out.println("_______________________________________");
    }
    
}
