package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

import java.util.ArrayList;

public class WeatherStation implements Subject{

    private float humidity;

    private float temperature;

    private float pressure;

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
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
            display.measurementChanged(this.temperature,this.humidity,this.pressure);
        }
    }
    
}
