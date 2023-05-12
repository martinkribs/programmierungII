package Entwurfsmuster.Strategy.Beispiele.DuckSimStart;

public class Tief implements Flyable{

    @Override
	public void fly() {
		System.out.println("Fly deep");
	}
    
}
