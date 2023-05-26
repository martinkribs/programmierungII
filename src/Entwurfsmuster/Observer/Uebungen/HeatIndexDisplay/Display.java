package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

public class Display implements Observer{

    String name;

    public Display(String name){
        this.name = name;
    }

    @Override
    public void measurementChanged(float temperature, float humidity, float pressure) {
        System.out.println("_______________________________________");
        System.out.println("Wetterstation: " +this.name);
        System.out.println("Temperatur: "+ temperature);
        System.out.println("Feuchtigkeit: "+ humidity);
        System.out.println("Druck: "+ pressure);
        System.out.println("_______________________________________");
    }
    
}
