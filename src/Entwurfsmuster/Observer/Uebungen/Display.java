package Entwurfsmuster.Observer.Uebungen;

public class Display implements Observer{

    WeatherStation weatherStation;

    public Display(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    @Override
    public void measurementChanged() {
        System.out.println();
    }
    
}
