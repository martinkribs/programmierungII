package Entwurfsmuster.Observer.Uebungen.HeatIndexDisplay;

import java.text.DecimalFormat;

public class HeatIndexDisplay implements Observer {

    String name;

    public HeatIndexDisplay(String name) {
        this.name = name;
    }

    @Override
    public void measurementChanged(float temperature, float humidity, float pressure) {
        System.out.println("_______________________________________");
        System.out.println("Wetterstation: " + this.name);
        System.out.println("Temperatur: " + temperature);
        System.out.println("Feuchtigkeit: " + humidity);
        System.out.println("Druck: " + pressure);
        DecimalFormat decimalFormat = new DecimalFormat("####0.00");
        System.out.println("Gefühlte Temperatur: " + decimalFormat.format(this.computeHeatIndex(temperature, humidity)));
        System.out.println("_______________________________________");
    }

    private double computeHeatIndex(double temperature, double humidity) {
        // N.B.: the following values are applicable for temperatures in °C. For °F
        // please use values from the table in
        // the referenced wiki article.
        // Also, the formula is only applicable for temperatures >= 26.7°C and
        // humidities >= 40%.
        // for reference: https://de.wikipedia.org/wiki/Hitzeindex or
        // https://en.wikipedia.org/wiki/Heat_index
        double c1, c2, c3, c4, c5, c6, c7, c8, c9, index;
        c1 = -8.784695;
        c2 = 1.61139411;
        c3 = 2.338549;
        c4 = -0.14611605;
        c5 = -0.012308094;
        c6 = -0.016425828;
        c7 = 0.002211732;
        c8 = 0.00072546;
        c9 = -0.000003582;
        index = c1 + c2 * temperature + c3 * humidity + c4 * temperature * humidity + c5 * temperature * temperature 
                + c6 * humidity * humidity + c7 * temperature * temperature * humidity 
                + c8 * temperature * humidity * humidity
                + c9 * temperature * temperature * humidity * humidity;
        return index;
    }

}
