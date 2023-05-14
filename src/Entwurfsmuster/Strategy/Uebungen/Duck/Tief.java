package Entwurfsmuster.Strategy.Uebungen.Duck;

public class Tief implements Flyable{

    @Override
	public void fly() {
		System.out.println("Fly deep");
	}
    
}
