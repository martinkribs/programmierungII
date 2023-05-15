package Entwurfsmuster.Strategy.Uebungen.Fliegen;

public class Tief implements Flyable{

    @Override
	public void fly() {
		System.out.println("Fly deep");
	}
    
}
