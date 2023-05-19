package Entwurfsmuster.Observer.Uebungen;

import java.util.ArrayList;

public class WeatherStation implements Subject{

    private float humidity;

    private float temperature;

    private float pressure;

    public float[] getWeather(){
        return new float[] {
            this.temperature,
            this.pressure,
            this.humidity
        };
    }
        

    public void setWeather(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        informDisplays();
    }
        

    private ArrayList<Observer> displays = new ArrayList<Observer>();

    @Override
    public void registerDisplay(Observer display) {
        this.displays.add(display);
    }

    @Override
    public void deleteDisplay(Observer display) {
        this.displays.remove(display);
    }

    @Override
    public void informDisplays() {
        for(Observer display : this.displays){
            display.measurementChanged();
        }
    }
    
}
